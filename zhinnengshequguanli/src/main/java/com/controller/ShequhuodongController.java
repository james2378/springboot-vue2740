
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 社区活动
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shequhuodong")
public class ShequhuodongController {
    private static final Logger logger = LoggerFactory.getLogger(ShequhuodongController.class);

    @Autowired
    private ShequhuodongService shequhuodongService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("shequhuodongDeleteStart",1);params.put("shequhuodongDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shequhuodongService.queryPage(params);

        //字典表数据转换
        List<ShequhuodongView> list =(List<ShequhuodongView>)page.getList();
        for(ShequhuodongView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShequhuodongEntity shequhuodong = shequhuodongService.selectById(id);
        if(shequhuodong !=null){
            //entity转view
            ShequhuodongView view = new ShequhuodongView();
            BeanUtils.copyProperties( shequhuodong , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShequhuodongEntity shequhuodong, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shequhuodong:{}",this.getClass().getName(),shequhuodong.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ShequhuodongEntity> queryWrapper = new EntityWrapper<ShequhuodongEntity>()
            .eq("shequhuodong_uuid_number", shequhuodong.getShequhuodongUuidNumber())
            .eq("shequhuodong_name", shequhuodong.getShequhuodongName())
            .eq("shequhuodong_types", shequhuodong.getShequhuodongTypes())
            .eq("shangxia_types", shequhuodong.getShangxiaTypes())
            .eq("shequhuodong_delete", shequhuodong.getShequhuodongDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShequhuodongEntity shequhuodongEntity = shequhuodongService.selectOne(queryWrapper);
        if(shequhuodongEntity==null){
            shequhuodong.setShangxiaTypes(1);
            shequhuodong.setShequhuodongDelete(1);
            shequhuodong.setCreateTime(new Date());
            shequhuodongService.insert(shequhuodong);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShequhuodongEntity shequhuodong, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shequhuodong:{}",this.getClass().getName(),shequhuodong.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ShequhuodongEntity> queryWrapper = new EntityWrapper<ShequhuodongEntity>()
            .notIn("id",shequhuodong.getId())
            .andNew()
            .eq("shequhuodong_uuid_number", shequhuodong.getShequhuodongUuidNumber())
            .eq("shequhuodong_name", shequhuodong.getShequhuodongName())
            .eq("shequhuodong_types", shequhuodong.getShequhuodongTypes())
            .eq("shangxia_types", shequhuodong.getShangxiaTypes())
            .eq("shequhuodong_delete", shequhuodong.getShequhuodongDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShequhuodongEntity shequhuodongEntity = shequhuodongService.selectOne(queryWrapper);
        if("".equals(shequhuodong.getShequhuodongPhoto()) || "null".equals(shequhuodong.getShequhuodongPhoto())){
                shequhuodong.setShequhuodongPhoto(null);
        }
        if(shequhuodongEntity==null){
            shequhuodongService.updateById(shequhuodong);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<ShequhuodongEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ShequhuodongEntity shequhuodongEntity = new ShequhuodongEntity();
            shequhuodongEntity.setId(id);
            shequhuodongEntity.setShequhuodongDelete(2);
            list.add(shequhuodongEntity);
        }
        if(list != null && list.size() >0){
            shequhuodongService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ShequhuodongEntity> shequhuodongList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShequhuodongEntity shequhuodongEntity = new ShequhuodongEntity();
//                            shequhuodongEntity.setShequhuodongUuidNumber(data.get(0));                    //社区活动编号 要改的
//                            shequhuodongEntity.setShequhuodongName(data.get(0));                    //社区活动名称 要改的
//                            shequhuodongEntity.setShequhuodongPhoto("");//详情和图片
//                            shequhuodongEntity.setShequhuodongKaishiTime(sdf.parse(data.get(0)));          //活动开始时间 要改的
//                            shequhuodongEntity.setShequhuodongJieshuTime(sdf.parse(data.get(0)));          //活动结束时间 要改的
//                            shequhuodongEntity.setShequhuodongTypes(Integer.valueOf(data.get(0)));   //社区活动类型 要改的
//                            shequhuodongEntity.setShequhuodongContent("");//详情和图片
//                            shequhuodongEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            shequhuodongEntity.setShequhuodongDelete(1);//逻辑删除字段
//                            shequhuodongEntity.setCreateTime(date);//时间
                            shequhuodongList.add(shequhuodongEntity);


                            //把要查询是否重复的字段放入map中
                                //社区活动编号
                                if(seachFields.containsKey("shequhuodongUuidNumber")){
                                    List<String> shequhuodongUuidNumber = seachFields.get("shequhuodongUuidNumber");
                                    shequhuodongUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shequhuodongUuidNumber = new ArrayList<>();
                                    shequhuodongUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shequhuodongUuidNumber",shequhuodongUuidNumber);
                                }
                        }

                        //查询是否重复
                         //社区活动编号
                        List<ShequhuodongEntity> shequhuodongEntities_shequhuodongUuidNumber = shequhuodongService.selectList(new EntityWrapper<ShequhuodongEntity>().in("shequhuodong_uuid_number", seachFields.get("shequhuodongUuidNumber")).eq("shequhuodong_delete", 1));
                        if(shequhuodongEntities_shequhuodongUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShequhuodongEntity s:shequhuodongEntities_shequhuodongUuidNumber){
                                repeatFields.add(s.getShequhuodongUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [社区活动编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shequhuodongService.insertBatch(shequhuodongList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shequhuodongService.queryPage(params);

        //字典表数据转换
        List<ShequhuodongView> list =(List<ShequhuodongView>)page.getList();
        for(ShequhuodongView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShequhuodongEntity shequhuodong = shequhuodongService.selectById(id);
            if(shequhuodong !=null){


                //entity转view
                ShequhuodongView view = new ShequhuodongView();
                BeanUtils.copyProperties( shequhuodong , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShequhuodongEntity shequhuodong, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shequhuodong:{}",this.getClass().getName(),shequhuodong.toString());
        Wrapper<ShequhuodongEntity> queryWrapper = new EntityWrapper<ShequhuodongEntity>()
            .eq("shequhuodong_uuid_number", shequhuodong.getShequhuodongUuidNumber())
            .eq("shequhuodong_name", shequhuodong.getShequhuodongName())
            .eq("shequhuodong_types", shequhuodong.getShequhuodongTypes())
            .eq("shangxia_types", shequhuodong.getShangxiaTypes())
            .eq("shequhuodong_delete", shequhuodong.getShequhuodongDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShequhuodongEntity shequhuodongEntity = shequhuodongService.selectOne(queryWrapper);
        if(shequhuodongEntity==null){
            shequhuodong.setShequhuodongDelete(1);
            shequhuodong.setCreateTime(new Date());
        shequhuodongService.insert(shequhuodong);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
