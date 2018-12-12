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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
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
                ", character='" + character + '\'' +
                ", function='" + function + '\'' +
                ", shape='" + shape + '\'' +
                ", delete=" + delete +
                '}';
    }
}
