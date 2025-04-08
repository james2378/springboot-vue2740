package com.entity.view;

import com.entity.GonggongchangsuoCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 公共场所收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gonggongchangsuo_collection")
public class GonggongchangsuoCollectionView extends GonggongchangsuoCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String gonggongchangsuoCollectionValue;



		//级联表 gonggongchangsuo
			/**
			* 公共场所编号
			*/
			private String gonggongchangsuoUuidNumber;
			/**
			* 公共场所名称
			*/
			private String gonggongchangsuoName;
			/**
			* 公共场所照片
			*/
			private String gonggongchangsuoPhoto;
			/**
			* 公共场所用途
			*/
			private String gonggongchangsuoYongtu;
			/**
			* 公共场所类型
			*/
			private Integer gonggongchangsuoTypes;
				/**
				* 公共场所类型的值
				*/
				private String gonggongchangsuoValue;
			/**
			* 公共场所介绍
			*/
			private String gonggongchangsuoContent;
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
			private Integer gonggongchangsuoDelete;

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

	public GonggongchangsuoCollectionView() {

	}

	public GonggongchangsuoCollectionView(GonggongchangsuoCollectionEntity gonggongchangsuoCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, gonggongchangsuoCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getGonggongchangsuoCollectionValue() {
				return gonggongchangsuoCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setGonggongchangsuoCollectionValue(String gonggongchangsuoCollectionValue) {
				this.gonggongchangsuoCollectionValue = gonggongchangsuoCollectionValue;
			}



















				//级联表的get和set gonggongchangsuo

					/**
					* 获取： 公共场所编号
					*/
					public String getGonggongchangsuoUuidNumber() {
						return gonggongchangsuoUuidNumber;
					}
					/**
					* 设置： 公共场所编号
					*/
					public void setGonggongchangsuoUuidNumber(String gonggongchangsuoUuidNumber) {
						this.gonggongchangsuoUuidNumber = gonggongchangsuoUuidNumber;
					}

					/**
					* 获取： 公共场所名称
					*/
					public String getGonggongchangsuoName() {
						return gonggongchangsuoName;
					}
					/**
					* 设置： 公共场所名称
					*/
					public void setGonggongchangsuoName(String gonggongchangsuoName) {
						this.gonggongchangsuoName = gonggongchangsuoName;
					}

					/**
					* 获取： 公共场所照片
					*/
					public String getGonggongchangsuoPhoto() {
						return gonggongchangsuoPhoto;
					}
					/**
					* 设置： 公共场所照片
					*/
					public void setGonggongchangsuoPhoto(String gonggongchangsuoPhoto) {
						this.gonggongchangsuoPhoto = gonggongchangsuoPhoto;
					}

					/**
					* 获取： 公共场所用途
					*/
					public String getGonggongchangsuoYongtu() {
						return gonggongchangsuoYongtu;
					}
					/**
					* 设置： 公共场所用途
					*/
					public void setGonggongchangsuoYongtu(String gonggongchangsuoYongtu) {
						this.gonggongchangsuoYongtu = gonggongchangsuoYongtu;
					}

					/**
					* 获取： 公共场所类型
					*/
					public Integer getGonggongchangsuoTypes() {
						return gonggongchangsuoTypes;
					}
					/**
					* 设置： 公共场所类型
					*/
					public void setGonggongchangsuoTypes(Integer gonggongchangsuoTypes) {
						this.gonggongchangsuoTypes = gonggongchangsuoTypes;
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
					* 获取： 公共场所介绍
					*/
					public String getGonggongchangsuoContent() {
						return gonggongchangsuoContent;
					}
					/**
					* 设置： 公共场所介绍
					*/
					public void setGonggongchangsuoContent(String gonggongchangsuoContent) {
						this.gonggongchangsuoContent = gonggongchangsuoContent;
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
					public Integer getGonggongchangsuoDelete() {
						return gonggongchangsuoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGonggongchangsuoDelete(Integer gonggongchangsuoDelete) {
						this.gonggongchangsuoDelete = gonggongchangsuoDelete;
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
