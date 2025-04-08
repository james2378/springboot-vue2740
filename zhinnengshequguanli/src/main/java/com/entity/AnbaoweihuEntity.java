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
 * 安保维护
 *
 * @author 
 * @email
 */
@TableName("anbaoweihu")
public class AnbaoweihuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public AnbaoweihuEntity() {

	}

	public AnbaoweihuEntity(T t) {
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
     * 安保维护名称
     */
    @TableField(value = "anbaoweihu_name")

    private String anbaoweihuName;


    /**
     * 安保维护图片
     */
    @TableField(value = "anbaoweihu_photo")

    private String anbaoweihuPhoto;


    /**
     * 服务时间段
     */
    @TableField(value = "shijianduan_types")

    private Integer shijianduanTypes;


    /**
     * 安保维护类型
     */
    @TableField(value = "anbaoweihu_types")

    private Integer anbaoweihuTypes;


    /**
     * 安保维护详情
     */
    @TableField(value = "anbaoweihu_content")

    private String anbaoweihuContent;


    /**
     * 安保维护发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：安保维护名称
	 */
    public String getAnbaoweihuName() {
        return anbaoweihuName;
    }
    /**
	 * 获取：安保维护名称
	 */

    public void setAnbaoweihuName(String anbaoweihuName) {
        this.anbaoweihuName = anbaoweihuName;
    }
    /**
	 * 设置：安保维护图片
	 */
    public String getAnbaoweihuPhoto() {
        return anbaoweihuPhoto;
    }
    /**
	 * 获取：安保维护图片
	 */

    public void setAnbaoweihuPhoto(String anbaoweihuPhoto) {
        this.anbaoweihuPhoto = anbaoweihuPhoto;
    }
    /**
	 * 设置：服务时间段
	 */
    public Integer getShijianduanTypes() {
        return shijianduanTypes;
    }
    /**
	 * 获取：服务时间段
	 */

    public void setShijianduanTypes(Integer shijianduanTypes) {
        this.shijianduanTypes = shijianduanTypes;
    }
    /**
	 * 设置：安保维护类型
	 */
    public Integer getAnbaoweihuTypes() {
        return anbaoweihuTypes;
    }
    /**
	 * 获取：安保维护类型
	 */

    public void setAnbaoweihuTypes(Integer anbaoweihuTypes) {
        this.anbaoweihuTypes = anbaoweihuTypes;
    }
    /**
	 * 设置：安保维护详情
	 */
    public String getAnbaoweihuContent() {
        return anbaoweihuContent;
    }
    /**
	 * 获取：安保维护详情
	 */

    public void setAnbaoweihuContent(String anbaoweihuContent) {
        this.anbaoweihuContent = anbaoweihuContent;
    }
    /**
	 * 设置：安保维护发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：安保维护发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Anbaoweihu{" +
            "id=" + id +
            ", anbaoweihuName=" + anbaoweihuName +
            ", anbaoweihuPhoto=" + anbaoweihuPhoto +
            ", shijianduanTypes=" + shijianduanTypes +
            ", anbaoweihuTypes=" + anbaoweihuTypes +
            ", anbaoweihuContent=" + anbaoweihuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
