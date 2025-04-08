package com.dao;

import com.entity.GonggongchangsuoOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggongchangsuoOrderView;

/**
 * 公共场所预约 Dao 接口
 *
 * @author 
 */
public interface GonggongchangsuoOrderDao extends BaseMapper<GonggongchangsuoOrderEntity> {

   List<GonggongchangsuoOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
