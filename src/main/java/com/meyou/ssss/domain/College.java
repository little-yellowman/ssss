package com.meyou.ssss.domain;

import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table college
 */
public class College {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.919+08:00", comments="Source field: college.college_id")
    private String collegeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.919+08:00", comments="Source field: college.college_amount")
    private Integer collegeAmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.919+08:00", comments="Source field: college.college_id")
    public String getCollegeId() {
        return collegeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.919+08:00", comments="Source field: college.college_id")
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.919+08:00", comments="Source field: college.college_amount")
    public Integer getCollegeAmount() {
        return collegeAmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.919+08:00", comments="Source field: college.college_amount")
    public void setCollegeAmount(Integer collegeAmount) {
        this.collegeAmount = collegeAmount;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-01T16:22:07.919+08:00", comments="Source Table: college")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collegeId=").append(collegeId);
        sb.append(", collegeAmount=").append(collegeAmount);
        sb.append("]");
        return sb.toString();
    }
}