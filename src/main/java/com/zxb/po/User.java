package com.zxb.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String userName;
    private String password;
    private String nonLegacyCategories;
    private String nonLegacyLevel;
    private String dateOfBirth;
    private String dateOfDeath;
    private String birthPlace;
    private String nationality;
    private String speciality;



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

    public String getNonLegacyCategories() {
        return nonLegacyCategories;
    }

    public void setNonLegacyCategories(String nonLegacyCategories) {
        this.nonLegacyCategories = nonLegacyCategories;
    }

    public String getNonLegacyLevel() {
        return nonLegacyLevel;
    }

    public void setNonLegacyLevel(String nonLegacyLevel) {
        this.nonLegacyLevel = nonLegacyLevel;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer userId, String userName, String password, String nonLegacyCategories, String nonLegacyLevel, String dateOfBirth, String dateOfDeath, String birthPlace, String nationality, String speciality) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.nonLegacyCategories = nonLegacyCategories;
        this.nonLegacyLevel = nonLegacyLevel;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.birthPlace = birthPlace;
        this.nationality = nationality;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nonLegacyCategories='" + nonLegacyCategories + '\'' +
                ", nonLegacyLevel='" + nonLegacyLevel + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfDeath='" + dateOfDeath + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", nationality='" + nationality + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}



