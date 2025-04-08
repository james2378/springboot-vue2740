package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnbaoweihuEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 安保维护 服务类
 */
public interface AnbaoweihuService extends IService<AnbaoweihuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}