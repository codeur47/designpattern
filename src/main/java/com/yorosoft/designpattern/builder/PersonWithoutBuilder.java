package com.yorosoft.designpattern.builder;

public class PersonWithoutBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
