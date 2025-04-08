package com.dao;

import com.entity.ShequhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequhuodongView;

/**
 * 社区活动 Dao 接口
 *
 * @author 
 */
public interface ShequhuodongDao extends BaseMapper<ShequhuodongEntity> {

   List<ShequhuodongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
