package com.dao;

import com.entity.ShequhuodongCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequhuodongCollectionView;

/**
 * 社区活动收藏 Dao 接口
 *
 * @author 
 */
public interface ShequhuodongCollectionDao extends BaseMapper<ShequhuodongCollectionEntity> {

   List<ShequhuodongCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
