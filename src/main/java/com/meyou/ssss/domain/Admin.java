package com.meyou.ssss.domain;

import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table admin
 */
public class Admin {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.896+08:00", comments="Source field: admin.number")
    private Long number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.9+08:00", comments="Source field: admin.admin_password")
    private String adminPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.899+08:00", comments="Source field: admin.number")
    public Long getNumber() {
        return number;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.9+08:00", comments="Source field: admin.number")
    public void setNumber(Long number) {
        this.number = number;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.9+08:00", comments="Source field: admin.admin_password")
    public String getAdminPassword() {
        return adminPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.9+08:00", comments="Source field: admin.admin_password")
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.9+08:00", comments="Source Table: admin")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", number=").append(number);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append("]");
        return sb.toString();
    }
}