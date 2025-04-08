package com.entity.model;

import com.entity.ShequhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 社区活动
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShequhuodongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 社区活动介绍
     */
    private String shequhuodongContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer shequhuodongDelete;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：社区活动编号
	 */
    public String getShequhuodongUuidNumber() {
        return shequhuodongUuidNumber;
    }


    /**
	 * 设置：社区活动编号
	 */
    public void setShequhuodongUuidNumber(String shequhuodongUuidNumber) {
        this.shequhuodongUuidNumber = shequhuodongUuidNumber;
    }
    /**
	 * 获取：社区活动名称
	 */
    public String getShequhuodongName() {
        return shequhuodongName;
    }


    /**
	 * 设置：社区活动名称
	 */
    public void setShequhuodongName(String shequhuodongName) {
        this.shequhuodongName = shequhuodongName;
    }
    /**
	 * 获取：社区活动照片
	 */
    public String getShequhuodongPhoto() {
        return shequhuodongPhoto;
    }


    /**
	 * 设置：社区活动照片
	 */
    public void setShequhuodongPhoto(String shequhuodongPhoto) {
        this.shequhuodongPhoto = shequhuodongPhoto;
    }
    /**
	 * 获取：活动开始时间
	 */
    public Date getShequhuodongKaishiTime() {
        return shequhuodongKaishiTime;
    }


    /**
	 * 设置：活动开始时间
	 */
    public void setShequhuodongKaishiTime(Date shequhuodongKaishiTime) {
        this.shequhuodongKaishiTime = shequhuodongKaishiTime;
    }
    /**
	 * 获取：活动结束时间
	 */
    public Date getShequhuodongJieshuTime() {
        return shequhuodongJieshuTime;
    }


    /**
	 * 设置：活动结束时间
	 */
    public void setShequhuodongJieshuTime(Date shequhuodongJieshuTime) {
        this.shequhuodongJieshuTime = shequhuodongJieshuTime;
    }
    /**
	 * 获取：社区活动类型
	 */
    public Integer getShequhuodongTypes() {
        return shequhuodongTypes;
    }


    /**
	 * 设置：社区活动类型
	 */
    public void setShequhuodongTypes(Integer shequhuodongTypes) {
        this.shequhuodongTypes = shequhuodongTypes;
    }
    /**
	 * 获取：社区活动介绍
	 */
    public String getShequhuodongContent() {
        return shequhuodongContent;
    }


    /**
	 * 设置：社区活动介绍
	 */
    public void setShequhuodongContent(String shequhuodongContent) {
        this.shequhuodongContent = shequhuodongContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getShequhuodongDelete() {
        return shequhuodongDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setShequhuodongDelete(Integer shequhuodongDelete) {
        this.shequhuodongDelete = shequhuodongDelete;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
