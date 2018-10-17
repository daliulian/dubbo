package com.lyl.study.domain;

/**
 * ***********************************************************
 *
 * @类名 : User
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.10.17
 *
 * ***********************************************************
 */
public class User {
  private String name;
  private String address;
  private Integer age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
