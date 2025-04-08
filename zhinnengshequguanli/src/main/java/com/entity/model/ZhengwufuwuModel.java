package com.entity.model;

import com.entity.ZhengwufuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 政务服务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhengwufuwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 政务服务名称
     */
    private String zhengwufuwuName;


    /**
     * 政务服务图片
     */
    private String zhengwufuwuPhoto;


    /**
     * 服务时间段
     */
    private Integer shijianduanTypes;


    /**
     * 政务服务类型
     */
    private Integer zhengwufuwuTypes;


    /**
     * 政务服务详情
     */
    private String zhengwufuwuContent;


    /**
     * 政务服务发布时间
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
	 * 获取：政务服务名称
	 */
    public String getZhengwufuwuName() {
        return zhengwufuwuName;
    }


    /**
	 * 设置：政务服务名称
	 */
    public void setZhengwufuwuName(String zhengwufuwuName) {
        this.zhengwufuwuName = zhengwufuwuName;
    }
    /**
	 * 获取：政务服务图片
	 */
    public String getZhengwufuwuPhoto() {
        return zhengwufuwuPhoto;
    }


    /**
	 * 设置：政务服务图片
	 */
    public void setZhengwufuwuPhoto(String zhengwufuwuPhoto) {
        this.zhengwufuwuPhoto = zhengwufuwuPhoto;
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
	 * 获取：政务服务类型
	 */
    public Integer getZhengwufuwuTypes() {
        return zhengwufuwuTypes;
    }


    /**
	 * 设置：政务服务类型
	 */
    public void setZhengwufuwuTypes(Integer zhengwufuwuTypes) {
        this.zhengwufuwuTypes = zhengwufuwuTypes;
    }
    /**
	 * 获取：政务服务详情
	 */
    public String getZhengwufuwuContent() {
        return zhengwufuwuContent;
    }


    /**
	 * 设置：政务服务详情
	 */
    public void setZhengwufuwuContent(String zhengwufuwuContent) {
        this.zhengwufuwuContent = zhengwufuwuContent;
    }
    /**
	 * 获取：政务服务发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：政务服务发布时间
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
