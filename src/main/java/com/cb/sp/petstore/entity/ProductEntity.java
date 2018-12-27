package com.cb.sp.petstore.entity;

public class ProductEntity{

	private	Integer	productId;

	private	String	productName;

	private	String	pic1;

	private	String	pic2;

	private	String	pic3;

	private	Long	price;

	private	Integer	number;

	private	String	introduction;

	private	Integer	type;

	private	Integer	age;

	private	String	variety;

	private	String	area;

	private	Integer	recommendation;

	private	Integer	salesVolum;

	private	String	characters;

	private	String	productFunction;

	private	String	productShape;

	private	Integer	productIsDelete;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPic1() {
		return pic1;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public String getPic2() {
		return pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getPic3() {
		return pic3;
	}

	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(Integer recommendation) {
		this.recommendation = recommendation;
	}

	public Integer getSalesVolum() {
		return salesVolum;
	}

	public void setSalesVolum(Integer salesVolum) {
		this.salesVolum = salesVolum;
	}

	public String getCharacters() {
		return characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	public String getProductFunction() {
		return productFunction;
	}

	public void setProductFunction(String productFunction) {
		this.productFunction = productFunction;
	}

	public String getProductShape() {
		return productShape;
	}

	public void setProductShape(String productShape) {
		this.productShape = productShape;
	}

	public Integer getProductIsDelete() {
		return productIsDelete;
	}

	public void setProductIsDelete(Integer productIsDelete) {
		this.productIsDelete = productIsDelete;
	}

	@Override
	public String toString() {
		return "ProductEntity{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				", pic1='" + pic1 + '\'' +
				", pic2='" + pic2 + '\'' +
				", pic3='" + pic3 + '\'' +
				", price=" + price +
				", number=" + number +
				", introduction='" + introduction + '\'' +
				", type=" + type +
				", age=" + age +
				", variety='" + variety + '\'' +
				", area='" + area + '\'' +
				", recommendation=" + recommendation +
				", salesVolum=" + salesVolum +
				", characters='" + characters + '\'' +
				", productFunction='" + productFunction + '\'' +
				", productShape='" + productShape + '\'' +
				", productIsDelete=" + productIsDelete +
				'}';
	}
}