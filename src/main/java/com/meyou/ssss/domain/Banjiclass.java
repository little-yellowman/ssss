package com.meyou.ssss.domain;

import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table banjiClass
 */
public class Banjiclass {
    private Monitor monitor;

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_id")
    private Long classId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_name")
    private String className;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_amount")
    private Integer classAmount;

    /**
     * Database Column Remarks:
     *   外键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.majorID_class")
    private Integer majoridClass;

    /**
     * Database Column Remarks:
     *   外键
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.monitorID_class")
    private Long monitoridClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_id")
    public Long getClassId() {
        return classId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_id")
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_name")
    public String getClassName() {
        return className;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_name")
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_amount")
    public Integer getClassAmount() {
        return classAmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.class_amount")
    public void setClassAmount(Integer classAmount) {
        this.classAmount = classAmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.majorID_class")
    public Integer getMajoridClass() {
        return majoridClass;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.majorID_class")
    public void setMajoridClass(Integer majoridClass) {
        this.majoridClass = majoridClass;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.monitorID_class")
    public Long getMonitoridClass() {
        return monitoridClass;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source field: banjiClass.monitorID_class")
    public void setMonitoridClass(Long monitoridClass) {
        this.monitoridClass = monitoridClass;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.938+08:00", comments="Source Table: banjiClass")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classId=").append(classId);
        sb.append(", className=").append(className);
        sb.append(", classAmount=").append(classAmount);
        sb.append(", majoridClass=").append(majoridClass);
        sb.append(", monitoridClass=").append(monitoridClass);
        sb.append(", monitor=").append(monitor);
        sb.append("]");
        return sb.toString();
    }
}