package com.dao;

import com.entity.AnbaoweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.AnbaoweihuView;

/**
 * 安保维护 Dao 接口
 *
 * @author 
 */
public interface AnbaoweihuDao extends BaseMapper<AnbaoweihuEntity> {

   List<AnbaoweihuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
