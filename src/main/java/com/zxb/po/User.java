package com.zxb.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String userName;
    private String password;
    private String py;
    private String dateOfBirth;
    private String enabled;
    @TableField("isdeleted")
    private String isDeleted;
    private String salary;
    private String nativePlaceProvince;
    private String nativePlaceCity;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", py='" + py + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", enabled='" + enabled + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", salary='" + salary + '\'' +
                ", nativePlaceProvince='" + nativePlaceProvince + '\'' +
                ", nativePlaceCity='" + nativePlaceCity + '\'' +
                '}';
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getNativePlaceProvince() {
        return nativePlaceProvince;
    }

    public void setNativePlaceProvince(String nativePlaceProvince) {
        this.nativePlaceProvince = nativePlaceProvince;
    }

    public String getNativePlaceCity() {
        return nativePlaceCity;
    }

    public void setNativePlaceCity(String nativePlaceCity) {
        this.nativePlaceCity = nativePlaceCity;
    }

    public User(Integer userId, String userName, String password, String py, String dateOfBirth, String enabled, String isDeleted, String salary, String nativePlaceProvince, String nativePlaceCity) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.py = py;
        this.dateOfBirth = dateOfBirth;
        this.enabled = enabled;
        this.isDeleted = isDeleted;
        this.salary = salary;
        this.nativePlaceProvince = nativePlaceProvince;
        this.nativePlaceCity = nativePlaceCity;
    }
}



