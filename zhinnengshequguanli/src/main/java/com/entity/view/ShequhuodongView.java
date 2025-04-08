package com.entity.view;

import com.entity.ShequhuodongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 社区活动
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shequhuodong")
public class ShequhuodongView extends ShequhuodongEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 社区活动类型的值
		*/
		private String shequhuodongValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ShequhuodongView() {

	}

	public ShequhuodongView(ShequhuodongEntity shequhuodongEntity) {
		try {
			BeanUtils.copyProperties(this, shequhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 社区活动类型的值
			*/
			public String getShequhuodongValue() {
				return shequhuodongValue;
			}
			/**
			* 设置： 社区活动类型的值
			*/
			public void setShequhuodongValue(String shequhuodongValue) {
				this.shequhuodongValue = shequhuodongValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}




















}
