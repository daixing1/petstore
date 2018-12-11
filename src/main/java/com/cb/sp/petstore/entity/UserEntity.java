package com.cb.sp.petstore.entity;

import java.math.BigDecimal;

public class UserEntity{

	private	Integer	userId;

	private	String	userName;

	private	String	password;

	private	String	nickName;

	private String  headUrl;

	private	Integer	role;

	private	Integer	sex;

	private	Integer	age;

	private	String	introduction;

	private	String	telephone;

	private	String	address;

	private BigDecimal cost;

	private	Integer	delete;

	private String  email;

	public	Integer	getUserId(){
		return	userId;
	}

	public	String	getUserName(){
		return	userName;
	}

	public	String	getPassword(){
		return	password;
	}

	public	String	getNickName(){
		return	nickName;
	}

	public	Integer	getRole(){
		return	role;
	}

	public	Integer	getSex(){
		return	sex;
	}

	public	Integer	getAge(){
		return	age;
	}

	public	String	getIntroduction(){
		return	introduction;
	}

	public	String	getTelephone(){
		return	telephone;
	}

	public	String	getAddress(){
		return	address;
	}

	public	BigDecimal	getCost(){
		return	cost;
	}

	public	Integer	getDelete(){
		return	delete;
	}

	public void	setUserId(Integer userId){
		this.userId = userId;
	}

	public void	setUserName(String userName){
		this.userName = userName;
	}

	public void	setPassword(String password){
		this.password = password;
	}

	public void	setNickName(String nickName){
		this.nickName = nickName;
	}

	public void	setRole(Integer role){
		this.role = role;
	}

	public void	setSex(Integer sex){
		this.sex = sex;
	}

	public void	setAge(Integer age){
		this.age = age;
	}

	public void	setIntroduction(String introduction){
		this.introduction = introduction;
	}

	public void	setTelephone(String telephone){
		this.telephone = telephone;
	}

	public void	setAddress(String address){
		this.address = address;
	}

	public void	setCost(BigDecimal cost){
		this.cost = cost;
	}

	public void	setDelete(Integer delete){
		this.delete = delete;
	}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", headUrl='" + headUrl + '\'' +
                ", role=" + role +
                ", sex=" + sex +
                ", age=" + age +
                ", introduction='" + introduction + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", cost=" + cost +
                ", delete=" + delete +
                ", email='" + email + '\'' +
                '}';
    }
}