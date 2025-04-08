package com.entity.view;

import com.entity.GonggongchangsuoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 公共场所
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gonggongchangsuo")
public class GonggongchangsuoView extends GonggongchangsuoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 公共场所类型的值
		*/
		private String gonggongchangsuoValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public GonggongchangsuoView() {

	}

	public GonggongchangsuoView(GonggongchangsuoEntity gonggongchangsuoEntity) {
		try {
			BeanUtils.copyProperties(this, gonggongchangsuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 公共场所类型的值
			*/
			public String getGonggongchangsuoValue() {
				return gonggongchangsuoValue;
			}
			/**
			* 设置： 公共场所类型的值
			*/
			public void setGonggongchangsuoValue(String gonggongchangsuoValue) {
				this.gonggongchangsuoValue = gonggongchangsuoValue;
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
