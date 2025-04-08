package com.entity.vo;

import com.entity.ZhengwufuwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政务服务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhengwufuwu")
public class ZhengwufuwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 政务服务名称
     */

    @TableField(value = "zhengwufuwu_name")
    private String zhengwufuwuName;


    /**
     * 政务服务图片
     */

    @TableField(value = "zhengwufuwu_photo")
    private String zhengwufuwuPhoto;


    /**
     * 服务时间段
     */

    @TableField(value = "shijianduan_types")
    private Integer shijianduanTypes;


    /**
     * 政务服务类型
     */

    @TableField(value = "zhengwufuwu_types")
    private Integer zhengwufuwuTypes;


    /**
     * 政务服务详情
     */

    @TableField(value = "zhengwufuwu_content")
    private String zhengwufuwuContent;


    /**
     * 政务服务发布时间
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
	 * 设置：政务服务名称
	 */
    public String getZhengwufuwuName() {
        return zhengwufuwuName;
    }


    /**
	 * 获取：政务服务名称
	 */

    public void setZhengwufuwuName(String zhengwufuwuName) {
        this.zhengwufuwuName = zhengwufuwuName;
    }
    /**
	 * 设置：政务服务图片
	 */
    public String getZhengwufuwuPhoto() {
        return zhengwufuwuPhoto;
    }


    /**
	 * 获取：政务服务图片
	 */

    public void setZhengwufuwuPhoto(String zhengwufuwuPhoto) {
        this.zhengwufuwuPhoto = zhengwufuwuPhoto;
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
	 * 设置：政务服务类型
	 */
    public Integer getZhengwufuwuTypes() {
        return zhengwufuwuTypes;
    }


    /**
	 * 获取：政务服务类型
	 */

    public void setZhengwufuwuTypes(Integer zhengwufuwuTypes) {
        this.zhengwufuwuTypes = zhengwufuwuTypes;
    }
    /**
	 * 设置：政务服务详情
	 */
    public String getZhengwufuwuContent() {
        return zhengwufuwuContent;
    }


    /**
	 * 获取：政务服务详情
	 */

    public void setZhengwufuwuContent(String zhengwufuwuContent) {
        this.zhengwufuwuContent = zhengwufuwuContent;
    }
    /**
	 * 设置：政务服务发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：政务服务发布时间
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
