package com.entity.view;

import com.entity.AnbaoweihuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 安保维护
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("anbaoweihu")
public class AnbaoweihuView extends AnbaoweihuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 服务时间段的值
		*/
		private String shijianduanValue;
		/**
		* 安保维护类型的值
		*/
		private String anbaoweihuValue;



	public AnbaoweihuView() {

	}

	public AnbaoweihuView(AnbaoweihuEntity anbaoweihuEntity) {
		try {
			BeanUtils.copyProperties(this, anbaoweihuEntity);
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
			* 获取： 安保维护类型的值
			*/
			public String getAnbaoweihuValue() {
				return anbaoweihuValue;
			}
			/**
			* 设置： 安保维护类型的值
			*/
			public void setAnbaoweihuValue(String anbaoweihuValue) {
				this.anbaoweihuValue = anbaoweihuValue;
			}




















}
