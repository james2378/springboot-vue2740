package com.dao;

import com.entity.ShequhuodongOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequhuodongOrderView;

/**
 * 社区活动预约 Dao 接口
 *
 * @author 
 */
public interface ShequhuodongOrderDao extends BaseMapper<ShequhuodongOrderEntity> {

   List<ShequhuodongOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
