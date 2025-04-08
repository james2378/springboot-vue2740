
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
 * 社区活动预约
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shequhuodongOrder")
public class ShequhuodongOrderController {
    private static final Logger logger = LoggerFactory.getLogger(ShequhuodongOrderController.class);

    @Autowired
    private ShequhuodongOrderService shequhuodongOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ShequhuodongService shequhuodongService;
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
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shequhuodongOrderService.queryPage(params);

        //字典表数据转换
        List<ShequhuodongOrderView> list =(List<ShequhuodongOrderView>)page.getList();
        for(ShequhuodongOrderView c:list){
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
        ShequhuodongOrderEntity shequhuodongOrder = shequhuodongOrderService.selectById(id);
        if(shequhuodongOrder !=null){
            //entity转view
            ShequhuodongOrderView view = new ShequhuodongOrderView();
            BeanUtils.copyProperties( shequhuodongOrder , view );//把实体数据重构到view中

                //级联表
                ShequhuodongEntity shequhuodong = shequhuodongService.selectById(shequhuodongOrder.getShequhuodongId());
                if(shequhuodong != null){
                    BeanUtils.copyProperties( shequhuodong , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShequhuodongId(shequhuodong.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(shequhuodongOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
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
    public R save(@RequestBody ShequhuodongOrderEntity shequhuodongOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shequhuodongOrder:{}",this.getClass().getName(),shequhuodongOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            shequhuodongOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        shequhuodongOrder.setInsertTime(new Date());
        shequhuodongOrder.setCreateTime(new Date());
        shequhuodongOrderService.insert(shequhuodongOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShequhuodongOrderEntity shequhuodongOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shequhuodongOrder:{}",this.getClass().getName(),shequhuodongOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            shequhuodongOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ShequhuodongOrderEntity> queryWrapper = new EntityWrapper<ShequhuodongOrderEntity>()
            .eq("id",0)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShequhuodongOrderEntity shequhuodongOrderEntity = shequhuodongOrderService.selectOne(queryWrapper);
        if(shequhuodongOrderEntity==null){
            shequhuodongOrderService.updateById(shequhuodongOrder);//根据id更新
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
        shequhuodongOrderService.deleteBatchIds(Arrays.asList(ids));
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
            List<ShequhuodongOrderEntity> shequhuodongOrderList = new ArrayList<>();//上传的东西
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
                            ShequhuodongOrderEntity shequhuodongOrderEntity = new ShequhuodongOrderEntity();
//                            shequhuodongOrderEntity.setShequhuodongOrderUuidNumber(data.get(0));                    //预约编号 要改的
//                            shequhuodongOrderEntity.setShequhuodongId(Integer.valueOf(data.get(0)));   //社区活动 要改的
//                            shequhuodongOrderEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            shequhuodongOrderEntity.setShequhuodongOrderYesnoTypes(Integer.valueOf(data.get(0)));   //审核状态 要改的
//                            shequhuodongOrderEntity.setShequhuodongOrderYesnoText(data.get(0));                    //审核意见 要改的
//                            shequhuodongOrderEntity.setInsertTime(date);//时间
//                            shequhuodongOrderEntity.setCreateTime(date);//时间
                            shequhuodongOrderList.add(shequhuodongOrderEntity);


                            //把要查询是否重复的字段放入map中
                                //预约编号
                                if(seachFields.containsKey("shequhuodongOrderUuidNumber")){
                                    List<String> shequhuodongOrderUuidNumber = seachFields.get("shequhuodongOrderUuidNumber");
                                    shequhuodongOrderUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shequhuodongOrderUuidNumber = new ArrayList<>();
                                    shequhuodongOrderUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shequhuodongOrderUuidNumber",shequhuodongOrderUuidNumber);
                                }
                        }

                        //查询是否重复
                         //预约编号
                        List<ShequhuodongOrderEntity> shequhuodongOrderEntities_shequhuodongOrderUuidNumber = shequhuodongOrderService.selectList(new EntityWrapper<ShequhuodongOrderEntity>().in("shequhuodong_order_uuid_number", seachFields.get("shequhuodongOrderUuidNumber")));
                        if(shequhuodongOrderEntities_shequhuodongOrderUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShequhuodongOrderEntity s:shequhuodongOrderEntities_shequhuodongOrderUuidNumber){
                                repeatFields.add(s.getShequhuodongOrderUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [预约编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shequhuodongOrderService.insertBatch(shequhuodongOrderList);
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
        PageUtils page = shequhuodongOrderService.queryPage(params);

        //字典表数据转换
        List<ShequhuodongOrderView> list =(List<ShequhuodongOrderView>)page.getList();
        for(ShequhuodongOrderView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShequhuodongOrderEntity shequhuodongOrder = shequhuodongOrderService.selectById(id);
            if(shequhuodongOrder !=null){


                //entity转view
                ShequhuodongOrderView view = new ShequhuodongOrderView();
                BeanUtils.copyProperties( shequhuodongOrder , view );//把实体数据重构到view中

                //级联表
                    ShequhuodongEntity shequhuodong = shequhuodongService.selectById(shequhuodongOrder.getShequhuodongId());
                if(shequhuodong != null){
                    BeanUtils.copyProperties( shequhuodong , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShequhuodongId(shequhuodong.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(shequhuodongOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
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
    public R add(@RequestBody ShequhuodongOrderEntity shequhuodongOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shequhuodongOrder:{}",this.getClass().getName(),shequhuodongOrder.toString());
            ShequhuodongEntity shequhuodongEntity = shequhuodongService.selectById(shequhuodongOrder.getShequhuodongId());
            if(shequhuodongEntity == null){
                return R.error(511,"查不到该社区活动");
            }
            // Double shequhuodongNewMoney = shequhuodongEntity.getShequhuodongNewMoney();

            if(false){
            }

            //计算所获得积分
            Double buyJifen =0.0;
            Integer userId = (Integer) request.getSession().getAttribute("userId");
            shequhuodongOrder.setYonghuId(userId); //设置订单支付人id
            shequhuodongOrder.setShequhuodongOrderUuidNumber(String.valueOf(new Date().getTime()));
            shequhuodongOrder.setInsertTime(new Date());
            shequhuodongOrder.setCreateTime(new Date());
                shequhuodongOrderService.insert(shequhuodongOrder);//新增订单
            return R.ok();
    }



}
