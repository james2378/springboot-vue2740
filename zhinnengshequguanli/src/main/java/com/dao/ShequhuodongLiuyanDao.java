package com.dao;

import com.entity.ShequhuodongLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequhuodongLiuyanView;

/**
 * 社区活动留言 Dao 接口
 *
 * @author 
 */
public interface ShequhuodongLiuyanDao extends BaseMapper<ShequhuodongLiuyanEntity> {

   List<ShequhuodongLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
