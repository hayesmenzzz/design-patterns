package com.seamount.designpatterns.builder;

public class Builder {

    String name = null;
    int number = 1;
    String sex = null;
    int age = 3;
    String school = null;

    public Student build(){
        return new Student(this);
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setNumber(int number) {
        this.number = number;
        return this;
    }

    public Builder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setSchool(String school) {
        this.school = school;
        return this;
    }
}
