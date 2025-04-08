package com.entity.view;

import com.entity.ShequhuodongCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 社区活动收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shequhuodong_collection")
public class ShequhuodongCollectionView extends ShequhuodongCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String shequhuodongCollectionValue;



		//级联表 shequhuodong
			/**
			* 社区活动编号
			*/
			private String shequhuodongUuidNumber;
			/**
			* 社区活动名称
			*/
			private String shequhuodongName;
			/**
			* 社区活动照片
			*/
			private String shequhuodongPhoto;
			/**
			* 活动开始时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date shequhuodongKaishiTime;
			/**
			* 活动结束时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date shequhuodongJieshuTime;
			/**
			* 社区活动类型
			*/
			private Integer shequhuodongTypes;
				/**
				* 社区活动类型的值
				*/
				private String shequhuodongValue;
			/**
			* 社区活动介绍
			*/
			private String shequhuodongContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer shequhuodongDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public ShequhuodongCollectionView() {

	}

	public ShequhuodongCollectionView(ShequhuodongCollectionEntity shequhuodongCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, shequhuodongCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getShequhuodongCollectionValue() {
				return shequhuodongCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setShequhuodongCollectionValue(String shequhuodongCollectionValue) {
				this.shequhuodongCollectionValue = shequhuodongCollectionValue;
			}





































				//级联表的get和set shequhuodong

					/**
					* 获取： 社区活动编号
					*/
					public String getShequhuodongUuidNumber() {
						return shequhuodongUuidNumber;
					}
					/**
					* 设置： 社区活动编号
					*/
					public void setShequhuodongUuidNumber(String shequhuodongUuidNumber) {
						this.shequhuodongUuidNumber = shequhuodongUuidNumber;
					}

					/**
					* 获取： 社区活动名称
					*/
					public String getShequhuodongName() {
						return shequhuodongName;
					}
					/**
					* 设置： 社区活动名称
					*/
					public void setShequhuodongName(String shequhuodongName) {
						this.shequhuodongName = shequhuodongName;
					}

					/**
					* 获取： 社区活动照片
					*/
					public String getShequhuodongPhoto() {
						return shequhuodongPhoto;
					}
					/**
					* 设置： 社区活动照片
					*/
					public void setShequhuodongPhoto(String shequhuodongPhoto) {
						this.shequhuodongPhoto = shequhuodongPhoto;
					}

					/**
					* 获取： 活动开始时间
					*/
					public Date getShequhuodongKaishiTime() {
						return shequhuodongKaishiTime;
					}
					/**
					* 设置： 活动开始时间
					*/
					public void setShequhuodongKaishiTime(Date shequhuodongKaishiTime) {
						this.shequhuodongKaishiTime = shequhuodongKaishiTime;
					}

					/**
					* 获取： 活动结束时间
					*/
					public Date getShequhuodongJieshuTime() {
						return shequhuodongJieshuTime;
					}
					/**
					* 设置： 活动结束时间
					*/
					public void setShequhuodongJieshuTime(Date shequhuodongJieshuTime) {
						this.shequhuodongJieshuTime = shequhuodongJieshuTime;
					}

					/**
					* 获取： 社区活动类型
					*/
					public Integer getShequhuodongTypes() {
						return shequhuodongTypes;
					}
					/**
					* 设置： 社区活动类型
					*/
					public void setShequhuodongTypes(Integer shequhuodongTypes) {
						this.shequhuodongTypes = shequhuodongTypes;
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
					* 获取： 社区活动介绍
					*/
					public String getShequhuodongContent() {
						return shequhuodongContent;
					}
					/**
					* 设置： 社区活动介绍
					*/
					public void setShequhuodongContent(String shequhuodongContent) {
						this.shequhuodongContent = shequhuodongContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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

					/**
					* 获取： 逻辑删除
					*/
					public Integer getShequhuodongDelete() {
						return shequhuodongDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShequhuodongDelete(Integer shequhuodongDelete) {
						this.shequhuodongDelete = shequhuodongDelete;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}






}
