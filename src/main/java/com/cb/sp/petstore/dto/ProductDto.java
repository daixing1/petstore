package com.cb.sp.petstore.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/11 17:52
 */
public class ProductDto implements Serializable {

    private static final long serialVersionUID = 7310272162758493640L;

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

    private	String	characters;

    private	String	productFunction;

    private	String	productShape;

    private	Byte	productIsDelete;

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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
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

    public Byte getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Byte recommendation) {
        this.recommendation = recommendation;
    }

    public Integer getSalesVolum() {
        return salesVolum;
    }

    public void setSalesVolum(Integer salesVolum) {
        this.salesVolum = salesVolum;
    }

    public String getcharacters() {
        return characters;
    }

    public void setcharacters(String characters) {
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

    public Byte getProductIsDelete() {
        return productIsDelete;
    }

    public void setProductIsDelete(Byte productIsDelete) {
        this.productIsDelete = productIsDelete;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
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
                ", characters='" + characters + '\'' +
                ", productFunction='" + productFunction + '\'' +
                ", productShape='" + productShape + '\'' +
                ", productIsDelete=" + productIsDelete +
                '}';
    }
}
