package com.entity.model;

import com.entity.ShequhuodongOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 社区活动预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShequhuodongOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预约编号
     */
    private String shequhuodongOrderUuidNumber;


    /**
     * 社区活动
     */
    private Integer shequhuodongId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 审核状态
     */
    private Integer shequhuodongOrderYesnoTypes;


    /**
     * 审核意见
     */
    private String shequhuodongOrderYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 获取：预约编号
	 */
    public String getShequhuodongOrderUuidNumber() {
        return shequhuodongOrderUuidNumber;
    }


    /**
	 * 设置：预约编号
	 */
    public void setShequhuodongOrderUuidNumber(String shequhuodongOrderUuidNumber) {
        this.shequhuodongOrderUuidNumber = shequhuodongOrderUuidNumber;
    }
    /**
	 * 获取：社区活动
	 */
    public Integer getShequhuodongId() {
        return shequhuodongId;
    }


    /**
	 * 设置：社区活动
	 */
    public void setShequhuodongId(Integer shequhuodongId) {
        this.shequhuodongId = shequhuodongId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getShequhuodongOrderYesnoTypes() {
        return shequhuodongOrderYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setShequhuodongOrderYesnoTypes(Integer shequhuodongOrderYesnoTypes) {
        this.shequhuodongOrderYesnoTypes = shequhuodongOrderYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getShequhuodongOrderYesnoText() {
        return shequhuodongOrderYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setShequhuodongOrderYesnoText(String shequhuodongOrderYesnoText) {
        this.shequhuodongOrderYesnoText = shequhuodongOrderYesnoText;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
