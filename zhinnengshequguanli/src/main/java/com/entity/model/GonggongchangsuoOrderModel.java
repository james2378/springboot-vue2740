package com.entity.model;

import com.entity.GonggongchangsuoOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公共场所预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GonggongchangsuoOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预约编号
     */
    private String gonggongchangsuoOrderUuidNumber;


    /**
     * 公共场所
     */
    private Integer gonggongchangsuoId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 使用用途
     */
    private String shiyongText;


    /**
     * 使用开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shiyongKaishiTime;


    /**
     * 使用结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shiyongJieshuTime;


    /**
     * 审核状态
     */
    private Integer gonggongchangsuoOrderYesnoTypes;


    /**
     * 审核意见
     */
    private String gonggongchangsuoOrderYesnoText;


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
    public String getGonggongchangsuoOrderUuidNumber() {
        return gonggongchangsuoOrderUuidNumber;
    }


    /**
	 * 设置：预约编号
	 */
    public void setGonggongchangsuoOrderUuidNumber(String gonggongchangsuoOrderUuidNumber) {
        this.gonggongchangsuoOrderUuidNumber = gonggongchangsuoOrderUuidNumber;
    }
    /**
	 * 获取：公共场所
	 */
    public Integer getGonggongchangsuoId() {
        return gonggongchangsuoId;
    }


    /**
	 * 设置：公共场所
	 */
    public void setGonggongchangsuoId(Integer gonggongchangsuoId) {
        this.gonggongchangsuoId = gonggongchangsuoId;
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
	 * 获取：使用用途
	 */
    public String getShiyongText() {
        return shiyongText;
    }


    /**
	 * 设置：使用用途
	 */
    public void setShiyongText(String shiyongText) {
        this.shiyongText = shiyongText;
    }
    /**
	 * 获取：使用开始时间
	 */
    public Date getShiyongKaishiTime() {
        return shiyongKaishiTime;
    }


    /**
	 * 设置：使用开始时间
	 */
    public void setShiyongKaishiTime(Date shiyongKaishiTime) {
        this.shiyongKaishiTime = shiyongKaishiTime;
    }
    /**
	 * 获取：使用结束时间
	 */
    public Date getShiyongJieshuTime() {
        return shiyongJieshuTime;
    }


    /**
	 * 设置：使用结束时间
	 */
    public void setShiyongJieshuTime(Date shiyongJieshuTime) {
        this.shiyongJieshuTime = shiyongJieshuTime;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getGonggongchangsuoOrderYesnoTypes() {
        return gonggongchangsuoOrderYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setGonggongchangsuoOrderYesnoTypes(Integer gonggongchangsuoOrderYesnoTypes) {
        this.gonggongchangsuoOrderYesnoTypes = gonggongchangsuoOrderYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getGonggongchangsuoOrderYesnoText() {
        return gonggongchangsuoOrderYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setGonggongchangsuoOrderYesnoText(String gonggongchangsuoOrderYesnoText) {
        this.gonggongchangsuoOrderYesnoText = gonggongchangsuoOrderYesnoText;
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
