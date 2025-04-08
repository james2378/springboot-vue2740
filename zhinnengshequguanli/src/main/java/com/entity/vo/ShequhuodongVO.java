package com.entity.vo;

import com.entity.ShequhuodongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社区活动
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shequhuodong")
public class ShequhuodongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 社区活动编号
     */

    @TableField(value = "shequhuodong_uuid_number")
    private String shequhuodongUuidNumber;


    /**
     * 社区活动名称
     */

    @TableField(value = "shequhuodong_name")
    private String shequhuodongName;


    /**
     * 社区活动照片
     */

    @TableField(value = "shequhuodong_photo")
    private String shequhuodongPhoto;


    /**
     * 活动开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shequhuodong_kaishi_time")
    private Date shequhuodongKaishiTime;


    /**
     * 活动结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shequhuodong_jieshu_time")
    private Date shequhuodongJieshuTime;


    /**
     * 社区活动类型
     */

    @TableField(value = "shequhuodong_types")
    private Integer shequhuodongTypes;


    /**
     * 社区活动介绍
     */

    @TableField(value = "shequhuodong_content")
    private String shequhuodongContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "shequhuodong_delete")
    private Integer shequhuodongDelete;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：社区活动编号
	 */
    public String getShequhuodongUuidNumber() {
        return shequhuodongUuidNumber;
    }


    /**
	 * 获取：社区活动编号
	 */

    public void setShequhuodongUuidNumber(String shequhuodongUuidNumber) {
        this.shequhuodongUuidNumber = shequhuodongUuidNumber;
    }
    /**
	 * 设置：社区活动名称
	 */
    public String getShequhuodongName() {
        return shequhuodongName;
    }


    /**
	 * 获取：社区活动名称
	 */

    public void setShequhuodongName(String shequhuodongName) {
        this.shequhuodongName = shequhuodongName;
    }
    /**
	 * 设置：社区活动照片
	 */
    public String getShequhuodongPhoto() {
        return shequhuodongPhoto;
    }


    /**
	 * 获取：社区活动照片
	 */

    public void setShequhuodongPhoto(String shequhuodongPhoto) {
        this.shequhuodongPhoto = shequhuodongPhoto;
    }
    /**
	 * 设置：活动开始时间
	 */
    public Date getShequhuodongKaishiTime() {
        return shequhuodongKaishiTime;
    }


    /**
	 * 获取：活动开始时间
	 */

    public void setShequhuodongKaishiTime(Date shequhuodongKaishiTime) {
        this.shequhuodongKaishiTime = shequhuodongKaishiTime;
    }
    /**
	 * 设置：活动结束时间
	 */
    public Date getShequhuodongJieshuTime() {
        return shequhuodongJieshuTime;
    }


    /**
	 * 获取：活动结束时间
	 */

    public void setShequhuodongJieshuTime(Date shequhuodongJieshuTime) {
        this.shequhuodongJieshuTime = shequhuodongJieshuTime;
    }
    /**
	 * 设置：社区活动类型
	 */
    public Integer getShequhuodongTypes() {
        return shequhuodongTypes;
    }


    /**
	 * 获取：社区活动类型
	 */

    public void setShequhuodongTypes(Integer shequhuodongTypes) {
        this.shequhuodongTypes = shequhuodongTypes;
    }
    /**
	 * 设置：社区活动介绍
	 */
    public String getShequhuodongContent() {
        return shequhuodongContent;
    }


    /**
	 * 获取：社区活动介绍
	 */

    public void setShequhuodongContent(String shequhuodongContent) {
        this.shequhuodongContent = shequhuodongContent;
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
    public Integer getShequhuodongDelete() {
        return shequhuodongDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShequhuodongDelete(Integer shequhuodongDelete) {
        this.shequhuodongDelete = shequhuodongDelete;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
