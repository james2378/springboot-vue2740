package com.dao;

import com.entity.GonggongchangsuoLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggongchangsuoLiuyanView;

/**
 * 公共场所留言 Dao 接口
 *
 * @author 
 */
public interface GonggongchangsuoLiuyanDao extends BaseMapper<GonggongchangsuoLiuyanEntity> {

   List<GonggongchangsuoLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
