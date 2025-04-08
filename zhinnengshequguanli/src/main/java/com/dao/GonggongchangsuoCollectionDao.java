package com.dao;

import com.entity.GonggongchangsuoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggongchangsuoCollectionView;

/**
 * 公共场所收藏 Dao 接口
 *
 * @author 
 */
public interface GonggongchangsuoCollectionDao extends BaseMapper<GonggongchangsuoCollectionEntity> {

   List<GonggongchangsuoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
