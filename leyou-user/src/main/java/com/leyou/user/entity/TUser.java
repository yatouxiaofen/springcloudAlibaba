package com.leyou.user.entity;

import java.util.Date;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  lenovo
 * @version  [版本号, 2024/12/27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class TUser {
    /**
    * ID
    */
    private Integer userId;

    /**
    * 名称
    */
    private String userName;

    /**
    * 描述信息
    */
    private String remark;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;

    /**
    * 是否删除，0未删除，1已删除
    */
    private Byte isDeleted;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}