package com.entity.model;

import com.entity.AnbaoweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 安保维护
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class AnbaoweihuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 安保维护名称
     */
    private String anbaoweihuName;


    /**
     * 安保维护图片
     */
    private String anbaoweihuPhoto;


    /**
     * 服务时间段
     */
    private Integer shijianduanTypes;


    /**
     * 安保维护类型
     */
    private Integer anbaoweihuTypes;


    /**
     * 安保维护详情
     */
    private String anbaoweihuContent;


    /**
     * 安保维护发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：安保维护名称
	 */
    public String getAnbaoweihuName() {
        return anbaoweihuName;
    }


    /**
	 * 设置：安保维护名称
	 */
    public void setAnbaoweihuName(String anbaoweihuName) {
        this.anbaoweihuName = anbaoweihuName;
    }
    /**
	 * 获取：安保维护图片
	 */
    public String getAnbaoweihuPhoto() {
        return anbaoweihuPhoto;
    }


    /**
	 * 设置：安保维护图片
	 */
    public void setAnbaoweihuPhoto(String anbaoweihuPhoto) {
        this.anbaoweihuPhoto = anbaoweihuPhoto;
    }
    /**
	 * 获取：服务时间段
	 */
    public Integer getShijianduanTypes() {
        return shijianduanTypes;
    }


    /**
	 * 设置：服务时间段
	 */
    public void setShijianduanTypes(Integer shijianduanTypes) {
        this.shijianduanTypes = shijianduanTypes;
    }
    /**
	 * 获取：安保维护类型
	 */
    public Integer getAnbaoweihuTypes() {
        return anbaoweihuTypes;
    }


    /**
	 * 设置：安保维护类型
	 */
    public void setAnbaoweihuTypes(Integer anbaoweihuTypes) {
        this.anbaoweihuTypes = anbaoweihuTypes;
    }
    /**
	 * 获取：安保维护详情
	 */
    public String getAnbaoweihuContent() {
        return anbaoweihuContent;
    }


    /**
	 * 设置：安保维护详情
	 */
    public void setAnbaoweihuContent(String anbaoweihuContent) {
        this.anbaoweihuContent = anbaoweihuContent;
    }
    /**
	 * 获取：安保维护发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：安保维护发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
