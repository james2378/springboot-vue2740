package com.entity.vo;

import com.entity.ShequhuodongOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社区活动预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shequhuodong_order")
public class ShequhuodongOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 预约编号
     */

    @TableField(value = "shequhuodong_order_uuid_number")
    private String shequhuodongOrderUuidNumber;


    /**
     * 社区活动
     */

    @TableField(value = "shequhuodong_id")
    private Integer shequhuodongId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 审核状态
     */

    @TableField(value = "shequhuodong_order_yesno_types")
    private Integer shequhuodongOrderYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "shequhuodong_order_yesno_text")
    private String shequhuodongOrderYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 设置：预约编号
	 */
    public String getShequhuodongOrderUuidNumber() {
        return shequhuodongOrderUuidNumber;
    }


    /**
	 * 获取：预约编号
	 */

    public void setShequhuodongOrderUuidNumber(String shequhuodongOrderUuidNumber) {
        this.shequhuodongOrderUuidNumber = shequhuodongOrderUuidNumber;
    }
    /**
	 * 设置：社区活动
	 */
    public Integer getShequhuodongId() {
        return shequhuodongId;
    }


    /**
	 * 获取：社区活动
	 */

    public void setShequhuodongId(Integer shequhuodongId) {
        this.shequhuodongId = shequhuodongId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getShequhuodongOrderYesnoTypes() {
        return shequhuodongOrderYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setShequhuodongOrderYesnoTypes(Integer shequhuodongOrderYesnoTypes) {
        this.shequhuodongOrderYesnoTypes = shequhuodongOrderYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getShequhuodongOrderYesnoText() {
        return shequhuodongOrderYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setShequhuodongOrderYesnoText(String shequhuodongOrderYesnoText) {
        this.shequhuodongOrderYesnoText = shequhuodongOrderYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
