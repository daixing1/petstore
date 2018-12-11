package com.cb.sp.petstore.entity;

public class UserEntity{

	private	Integer	userId;

	private	String	userName;

	private	String	password;

	private	String	nickName;

	private	Byte	role;

	private	Byte	sex;

	private	Integer	age;

	private	String	introduction;

	private	String	telephone;

	private	String	address;

	private	Long	cost;

	private	Byte	delete;

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

	public	Byte	getRole(){
		return	role;
	}

	public	Byte	getSex(){
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

	public	Long	getCost(){
		return	cost;
	}

	public	Byte	getDelete(){
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

	public void	setRole(Byte role){
		this.role = role;
	}

	public void	setSex(Byte sex){
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

	public void	setCost(Long cost){
		this.cost = cost;
	}

	public void	setDelete(Byte delete){
		this.delete = delete;
	}

	@Override
	public String toString() {
		return "UserEntity{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", nickName='" + nickName + '\'' +
				", role=" + role +
				", sex=" + sex +
				", age=" + age +
				", introduction='" + introduction + '\'' +
				", telephone='" + telephone + '\'' +
				", address='" + address + '\'' +
				", cost=" + cost +
				", delete=" + delete +
				'}';
	}
}