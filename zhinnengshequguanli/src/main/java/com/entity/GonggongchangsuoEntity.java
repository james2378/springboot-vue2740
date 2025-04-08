package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 公共场所
 *
 * @author 
 * @email
 */
@TableName("gonggongchangsuo")
public class GonggongchangsuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GonggongchangsuoEntity() {

	}

	public GonggongchangsuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 公共场所编号
     */
    @TableField(value = "gonggongchangsuo_uuid_number")

    private String gonggongchangsuoUuidNumber;


    /**
     * 公共场所名称
     */
    @TableField(value = "gonggongchangsuo_name")

    private String gonggongchangsuoName;


    /**
     * 公共场所照片
     */
    @TableField(value = "gonggongchangsuo_photo")

    private String gonggongchangsuoPhoto;


    /**
     * 公共场所用途
     */
    @TableField(value = "gonggongchangsuo_yongtu")

    private String gonggongchangsuoYongtu;


    /**
     * 公共场所类型
     */
    @TableField(value = "gonggongchangsuo_types")

    private Integer gonggongchangsuoTypes;


    /**
     * 公共场所介绍
     */
    @TableField(value = "gonggongchangsuo_content")

    private String gonggongchangsuoContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "gonggongchangsuo_delete")

    private Integer gonggongchangsuoDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：公共场所编号
	 */
    public String getGonggongchangsuoUuidNumber() {
        return gonggongchangsuoUuidNumber;
    }
    /**
	 * 获取：公共场所编号
	 */

    public void setGonggongchangsuoUuidNumber(String gonggongchangsuoUuidNumber) {
        this.gonggongchangsuoUuidNumber = gonggongchangsuoUuidNumber;
    }
    /**
	 * 设置：公共场所名称
	 */
    public String getGonggongchangsuoName() {
        return gonggongchangsuoName;
    }
    /**
	 * 获取：公共场所名称
	 */

    public void setGonggongchangsuoName(String gonggongchangsuoName) {
        this.gonggongchangsuoName = gonggongchangsuoName;
    }
    /**
	 * 设置：公共场所照片
	 */
    public String getGonggongchangsuoPhoto() {
        return gonggongchangsuoPhoto;
    }
    /**
	 * 获取：公共场所照片
	 */

    public void setGonggongchangsuoPhoto(String gonggongchangsuoPhoto) {
        this.gonggongchangsuoPhoto = gonggongchangsuoPhoto;
    }
    /**
	 * 设置：公共场所用途
	 */
    public String getGonggongchangsuoYongtu() {
        return gonggongchangsuoYongtu;
    }
    /**
	 * 获取：公共场所用途
	 */

    public void setGonggongchangsuoYongtu(String gonggongchangsuoYongtu) {
        this.gonggongchangsuoYongtu = gonggongchangsuoYongtu;
    }
    /**
	 * 设置：公共场所类型
	 */
    public Integer getGonggongchangsuoTypes() {
        return gonggongchangsuoTypes;
    }
    /**
	 * 获取：公共场所类型
	 */

    public void setGonggongchangsuoTypes(Integer gonggongchangsuoTypes) {
        this.gonggongchangsuoTypes = gonggongchangsuoTypes;
    }
    /**
	 * 设置：公共场所介绍
	 */
    public String getGonggongchangsuoContent() {
        return gonggongchangsuoContent;
    }
    /**
	 * 获取：公共场所介绍
	 */

    public void setGonggongchangsuoContent(String gonggongchangsuoContent) {
        this.gonggongchangsuoContent = gonggongchangsuoContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGonggongchangsuoDelete() {
        return gonggongchangsuoDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setGonggongchangsuoDelete(Integer gonggongchangsuoDelete) {
        this.gonggongchangsuoDelete = gonggongchangsuoDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gonggongchangsuo{" +
            "id=" + id +
            ", gonggongchangsuoUuidNumber=" + gonggongchangsuoUuidNumber +
            ", gonggongchangsuoName=" + gonggongchangsuoName +
            ", gonggongchangsuoPhoto=" + gonggongchangsuoPhoto +
            ", gonggongchangsuoYongtu=" + gonggongchangsuoYongtu +
            ", gonggongchangsuoTypes=" + gonggongchangsuoTypes +
            ", gonggongchangsuoContent=" + gonggongchangsuoContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", gonggongchangsuoDelete=" + gonggongchangsuoDelete +
            ", createTime=" + createTime +
        "}";
    }
}
