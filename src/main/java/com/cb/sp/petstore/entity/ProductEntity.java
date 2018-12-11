package com.cb.sp.petstore.entity;

import java.math.BigDecimal;

public class ProductEntity{

	private	Integer	productId;

	private	String	productName;

	private BigDecimal price;

	private	Integer	number;

	private	String	introduction;

	private	Integer	type;

	private	Integer	age;

	private	String	variety;

	private	String	area;

	private	Integer	recommendation;

	private	Integer	salesVolum;

	private	String	character;

	private	String	function;

	private	String	shape;

	private	Integer	delete;

	public	Integer	getProductId(){
		return	productId;
	}

	public	String	getProductName(){
		return	productName;
	}

	public	BigDecimal	getPrice(){
		return	price;
	}

	public	Integer	getNumber(){
		return	number;
	}

	public	String	getIntroduction(){
		return	introduction;
	}

	public	Integer	getType(){
		return	type;
	}

	public	Integer	getAge(){
		return	age;
	}

	public	String	getVariety(){
		return	variety;
	}

	public	String	getArea(){
		return	area;
	}

	public	Integer	getRecommendation(){
		return	recommendation;
	}

	public	Integer	getSalesVolum(){
		return	salesVolum;
	}

	public	String	getCharacter(){
		return	character;
	}

	public	String	getFunction(){
		return	function;
	}

	public	String	getShape(){
		return	shape;
	}

	public	Integer	getDelete(){
		return	delete;
	}

	public void	setProductId(Integer productId){
		this.productId = productId;
	}

	public void	setProductName(String productName){
		this.productName = productName;
	}

	public void	setPrice(BigDecimal price){
		this.price = price;
	}

	public void	setNumber(Integer number){
		this.number = number;
	}

	public void	setIntroduction(String introduction){
		this.introduction = introduction;
	}

	public void	setType(Integer type){
		this.type = type;
	}

	public void	setAge(Integer age){
		this.age = age;
	}

	public void	setVariety(String variety){
		this.variety = variety;
	}

	public void	setArea(String area){
		this.area = area;
	}

	public void	setRecommendation(Integer recommendation){
		this.recommendation = recommendation;
	}

	public void	setSalesVolum(Integer salesVolum){
		this.salesVolum = salesVolum;
	}

	public void	setCharacter(String character){
		this.character = character;
	}

	public void	setFunction(String function){
		this.function = function;
	}

	public void	setShape(String shape){
		this.shape = shape;
	}

	public void	setDelete(Integer delete){
		this.delete = delete;
	}

	@Override
	public String toString() {
		return "ProductEntity{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				", price=" + price +
				", number=" + number +
				", introduction='" + introduction + '\'' +
				", type=" + type +
				", age=" + age +
				", variety='" + variety + '\'' +
				", area='" + area + '\'' +
				", recommendation=" + recommendation +
				", salesVolum=" + salesVolum +
				", character='" + character + '\'' +
				", function='" + function + '\'' +
				", shape='" + shape + '\'' +
				", delete=" + delete +
				'}';
	}
}