package com.entity.vo;

import com.entity.AnbaoweihuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 安保维护
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("anbaoweihu")
public class AnbaoweihuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
