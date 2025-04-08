package com.entity.model;

import com.entity.GonggongchangsuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公共场所
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GonggongchangsuoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 公共场所编号
     */
    private String gonggongchangsuoUuidNumber;


    /**
     * 公共场所名称
     */
    private String gonggongchangsuoName;


    /**
     * 公共场所照片
     */
    private String gonggongchangsuoPhoto;


    /**
     * 公共场所用途
     */
    private String gonggongchangsuoYongtu;


    /**
     * 公共场所类型
     */
    private Integer gonggongchangsuoTypes;


    /**
     * 公共场所介绍
     */
    private String gonggongchangsuoContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer gonggongchangsuoDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：公共场所编号
	 */
    public String getGonggongchangsuoUuidNumber() {
        return gonggongchangsuoUuidNumber;
    }


    /**
	 * 设置：公共场所编号
	 */
    public void setGonggongchangsuoUuidNumber(String gonggongchangsuoUuidNumber) {
        this.gonggongchangsuoUuidNumber = gonggongchangsuoUuidNumber;
    }
    /**
	 * 获取：公共场所名称
	 */
    public String getGonggongchangsuoName() {
        return gonggongchangsuoName;
    }


    /**
	 * 设置：公共场所名称
	 */
    public void setGonggongchangsuoName(String gonggongchangsuoName) {
        this.gonggongchangsuoName = gonggongchangsuoName;
    }
    /**
	 * 获取：公共场所照片
	 */
    public String getGonggongchangsuoPhoto() {
        return gonggongchangsuoPhoto;
    }


    /**
	 * 设置：公共场所照片
	 */
    public void setGonggongchangsuoPhoto(String gonggongchangsuoPhoto) {
        this.gonggongchangsuoPhoto = gonggongchangsuoPhoto;
    }
    /**
	 * 获取：公共场所用途
	 */
    public String getGonggongchangsuoYongtu() {
        return gonggongchangsuoYongtu;
    }


    /**
	 * 设置：公共场所用途
	 */
    public void setGonggongchangsuoYongtu(String gonggongchangsuoYongtu) {
        this.gonggongchangsuoYongtu = gonggongchangsuoYongtu;
    }
    /**
	 * 获取：公共场所类型
	 */
    public Integer getGonggongchangsuoTypes() {
        return gonggongchangsuoTypes;
    }


    /**
	 * 设置：公共场所类型
	 */
    public void setGonggongchangsuoTypes(Integer gonggongchangsuoTypes) {
        this.gonggongchangsuoTypes = gonggongchangsuoTypes;
    }
    /**
	 * 获取：公共场所介绍
	 */
    public String getGonggongchangsuoContent() {
        return gonggongchangsuoContent;
    }


    /**
	 * 设置：公共场所介绍
	 */
    public void setGonggongchangsuoContent(String gonggongchangsuoContent) {
        this.gonggongchangsuoContent = gonggongchangsuoContent;
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
    public Integer getGonggongchangsuoDelete() {
        return gonggongchangsuoDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setGonggongchangsuoDelete(Integer gonggongchangsuoDelete) {
        this.gonggongchangsuoDelete = gonggongchangsuoDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
