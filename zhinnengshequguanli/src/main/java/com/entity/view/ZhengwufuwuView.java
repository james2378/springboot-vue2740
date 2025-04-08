package com.entity.view;

import com.entity.ZhengwufuwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 政务服务
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhengwufuwu")
public class ZhengwufuwuView extends ZhengwufuwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 服务时间段的值
		*/
		private String shijianduanValue;
		/**
		* 政务服务类型的值
		*/
		private String zhengwufuwuValue;



	public ZhengwufuwuView() {

	}

	public ZhengwufuwuView(ZhengwufuwuEntity zhengwufuwuEntity) {
		try {
			BeanUtils.copyProperties(this, zhengwufuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 服务时间段的值
			*/
			public String getShijianduanValue() {
				return shijianduanValue;
			}
			/**
			* 设置： 服务时间段的值
			*/
			public void setShijianduanValue(String shijianduanValue) {
				this.shijianduanValue = shijianduanValue;
			}
			/**
			* 获取： 政务服务类型的值
			*/
			public String getZhengwufuwuValue() {
				return zhengwufuwuValue;
			}
			/**
			* 设置： 政务服务类型的值
			*/
			public void setZhengwufuwuValue(String zhengwufuwuValue) {
				this.zhengwufuwuValue = zhengwufuwuValue;
			}




















}
