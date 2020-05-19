package com.swjd.bean;

public class User {
    private Integer id;
    private String stuName ;
    private String stuAge;

    public User() {
    }

    public User(String stuName, String stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public User(Integer id, String stuName, String stuAge) {
        this.id = id;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuAge='" + stuAge + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }
}
