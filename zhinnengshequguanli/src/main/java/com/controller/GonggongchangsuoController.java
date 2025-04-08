
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
 * 公共场所
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/gonggongchangsuo")
public class GonggongchangsuoController {
    private static final Logger logger = LoggerFactory.getLogger(GonggongchangsuoController.class);

    @Autowired
    private GonggongchangsuoService gonggongchangsuoService;


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
        params.put("gonggongchangsuoDeleteStart",1);params.put("gonggongchangsuoDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = gonggongchangsuoService.queryPage(params);

        //字典表数据转换
        List<GonggongchangsuoView> list =(List<GonggongchangsuoView>)page.getList();
        for(GonggongchangsuoView c:list){
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
        GonggongchangsuoEntity gonggongchangsuo = gonggongchangsuoService.selectById(id);
        if(gonggongchangsuo !=null){
            //entity转view
            GonggongchangsuoView view = new GonggongchangsuoView();
            BeanUtils.copyProperties( gonggongchangsuo , view );//把实体数据重构到view中

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
    public R save(@RequestBody GonggongchangsuoEntity gonggongchangsuo, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,gonggongchangsuo:{}",this.getClass().getName(),gonggongchangsuo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<GonggongchangsuoEntity> queryWrapper = new EntityWrapper<GonggongchangsuoEntity>()
            .eq("gonggongchangsuo_uuid_number", gonggongchangsuo.getGonggongchangsuoUuidNumber())
            .eq("gonggongchangsuo_name", gonggongchangsuo.getGonggongchangsuoName())
            .eq("gonggongchangsuo_yongtu", gonggongchangsuo.getGonggongchangsuoYongtu())
            .eq("gonggongchangsuo_types", gonggongchangsuo.getGonggongchangsuoTypes())
            .eq("shangxia_types", gonggongchangsuo.getShangxiaTypes())
            .eq("gonggongchangsuo_delete", gonggongchangsuo.getGonggongchangsuoDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GonggongchangsuoEntity gonggongchangsuoEntity = gonggongchangsuoService.selectOne(queryWrapper);
        if(gonggongchangsuoEntity==null){
            gonggongchangsuo.setShangxiaTypes(1);
            gonggongchangsuo.setGonggongchangsuoDelete(1);
            gonggongchangsuo.setCreateTime(new Date());
            gonggongchangsuoService.insert(gonggongchangsuo);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GonggongchangsuoEntity gonggongchangsuo, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,gonggongchangsuo:{}",this.getClass().getName(),gonggongchangsuo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<GonggongchangsuoEntity> queryWrapper = new EntityWrapper<GonggongchangsuoEntity>()
            .notIn("id",gonggongchangsuo.getId())
            .andNew()
            .eq("gonggongchangsuo_uuid_number", gonggongchangsuo.getGonggongchangsuoUuidNumber())
            .eq("gonggongchangsuo_name", gonggongchangsuo.getGonggongchangsuoName())
            .eq("gonggongchangsuo_yongtu", gonggongchangsuo.getGonggongchangsuoYongtu())
            .eq("gonggongchangsuo_types", gonggongchangsuo.getGonggongchangsuoTypes())
            .eq("shangxia_types", gonggongchangsuo.getShangxiaTypes())
            .eq("gonggongchangsuo_delete", gonggongchangsuo.getGonggongchangsuoDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GonggongchangsuoEntity gonggongchangsuoEntity = gonggongchangsuoService.selectOne(queryWrapper);
        if("".equals(gonggongchangsuo.getGonggongchangsuoPhoto()) || "null".equals(gonggongchangsuo.getGonggongchangsuoPhoto())){
                gonggongchangsuo.setGonggongchangsuoPhoto(null);
        }
        if(gonggongchangsuoEntity==null){
            gonggongchangsuoService.updateById(gonggongchangsuo);//根据id更新
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
        ArrayList<GonggongchangsuoEntity> list = new ArrayList<>();
        for(Integer id:ids){
            GonggongchangsuoEntity gonggongchangsuoEntity = new GonggongchangsuoEntity();
            gonggongchangsuoEntity.setId(id);
            gonggongchangsuoEntity.setGonggongchangsuoDelete(2);
            list.add(gonggongchangsuoEntity);
        }
        if(list != null && list.size() >0){
            gonggongchangsuoService.updateBatchById(list);
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
            List<GonggongchangsuoEntity> gonggongchangsuoList = new ArrayList<>();//上传的东西
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
                            GonggongchangsuoEntity gonggongchangsuoEntity = new GonggongchangsuoEntity();
//                            gonggongchangsuoEntity.setGonggongchangsuoUuidNumber(data.get(0));                    //公共场所编号 要改的
//                            gonggongchangsuoEntity.setGonggongchangsuoName(data.get(0));                    //公共场所名称 要改的
//                            gonggongchangsuoEntity.setGonggongchangsuoPhoto("");//详情和图片
//                            gonggongchangsuoEntity.setGonggongchangsuoYongtu(data.get(0));                    //公共场所用途 要改的
//                            gonggongchangsuoEntity.setGonggongchangsuoTypes(Integer.valueOf(data.get(0)));   //公共场所类型 要改的
//                            gonggongchangsuoEntity.setGonggongchangsuoContent("");//详情和图片
//                            gonggongchangsuoEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            gonggongchangsuoEntity.setGonggongchangsuoDelete(1);//逻辑删除字段
//                            gonggongchangsuoEntity.setCreateTime(date);//时间
                            gonggongchangsuoList.add(gonggongchangsuoEntity);


                            //把要查询是否重复的字段放入map中
                                //公共场所编号
                                if(seachFields.containsKey("gonggongchangsuoUuidNumber")){
                                    List<String> gonggongchangsuoUuidNumber = seachFields.get("gonggongchangsuoUuidNumber");
                                    gonggongchangsuoUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> gonggongchangsuoUuidNumber = new ArrayList<>();
                                    gonggongchangsuoUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("gonggongchangsuoUuidNumber",gonggongchangsuoUuidNumber);
                                }
                        }

                        //查询是否重复
                         //公共场所编号
                        List<GonggongchangsuoEntity> gonggongchangsuoEntities_gonggongchangsuoUuidNumber = gonggongchangsuoService.selectList(new EntityWrapper<GonggongchangsuoEntity>().in("gonggongchangsuo_uuid_number", seachFields.get("gonggongchangsuoUuidNumber")).eq("gonggongchangsuo_delete", 1));
                        if(gonggongchangsuoEntities_gonggongchangsuoUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(GonggongchangsuoEntity s:gonggongchangsuoEntities_gonggongchangsuoUuidNumber){
                                repeatFields.add(s.getGonggongchangsuoUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [公共场所编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        gonggongchangsuoService.insertBatch(gonggongchangsuoList);
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
        PageUtils page = gonggongchangsuoService.queryPage(params);

        //字典表数据转换
        List<GonggongchangsuoView> list =(List<GonggongchangsuoView>)page.getList();
        for(GonggongchangsuoView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GonggongchangsuoEntity gonggongchangsuo = gonggongchangsuoService.selectById(id);
            if(gonggongchangsuo !=null){


                //entity转view
                GonggongchangsuoView view = new GonggongchangsuoView();
                BeanUtils.copyProperties( gonggongchangsuo , view );//把实体数据重构到view中

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
    public R add(@RequestBody GonggongchangsuoEntity gonggongchangsuo, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,gonggongchangsuo:{}",this.getClass().getName(),gonggongchangsuo.toString());
        Wrapper<GonggongchangsuoEntity> queryWrapper = new EntityWrapper<GonggongchangsuoEntity>()
            .eq("gonggongchangsuo_uuid_number", gonggongchangsuo.getGonggongchangsuoUuidNumber())
            .eq("gonggongchangsuo_name", gonggongchangsuo.getGonggongchangsuoName())
            .eq("gonggongchangsuo_yongtu", gonggongchangsuo.getGonggongchangsuoYongtu())
            .eq("gonggongchangsuo_types", gonggongchangsuo.getGonggongchangsuoTypes())
            .eq("shangxia_types", gonggongchangsuo.getShangxiaTypes())
            .eq("gonggongchangsuo_delete", gonggongchangsuo.getGonggongchangsuoDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GonggongchangsuoEntity gonggongchangsuoEntity = gonggongchangsuoService.selectOne(queryWrapper);
        if(gonggongchangsuoEntity==null){
            gonggongchangsuo.setGonggongchangsuoDelete(1);
            gonggongchangsuo.setCreateTime(new Date());
        gonggongchangsuoService.insert(gonggongchangsuo);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
