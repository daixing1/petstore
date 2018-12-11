package com.cb.sp.petstore.entity;

public class ProductEntity{

	private	Integer	productId;

	private	String	productName;

	private	Long	price;

	private	Integer	number;

	private	String	introduction;

	private	Byte	type;

	private	Integer	age;

	private	String	variety;

	private	String	area;

	private	Byte	recommendation;

	private	Integer	salesVolum;

	private	String	character;

	private	String	function;

	private	String	shape;

	private	Byte	delete;

	public	Integer	getProductId(){
		return	productId;
	}

	public	String	getProductName(){
		return	productName;
	}

	public	Long	getPrice(){
		return	price;
	}

	public	Integer	getNumber(){
		return	number;
	}

	public	String	getIntroduction(){
		return	introduction;
	}

	public	Byte	getType(){
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

	public	Byte	getRecommendation(){
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

	public	Byte	getDelete(){
		return	delete;
	}

	public void	setProductId(Integer productId){
		this.productId = productId;
	}

	public void	setProductName(String productName){
		this.productName = productName;
	}

	public void	setPrice(Long price){
		this.price = price;
	}

	public void	setNumber(Integer number){
		this.number = number;
	}

	public void	setIntroduction(String introduction){
		this.introduction = introduction;
	}

	public void	setType(Byte type){
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

	public void	setRecommendation(Byte recommendation){
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

	public void	setDelete(Byte delete){
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