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

    private	String	pic1;

    private	String	pic2;

    private	String	pic3;

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

    public	Integer	getProductId(){
        return	productId;
    }

    public	String	getProductName(){
        return	productName;
    }

    public	String	getPic1(){
        return	pic1;
    }

    public	String	getPic2(){
        return	pic2;
    }

    public	String	getPic3(){
        return	pic3;
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

    public	String	getCharacters(){
        return	characters;
    }

    public	String	getProductFunction(){
        return	productFunction;
    }

    public	String	getProductShape(){
        return	productShape;
    }

    public	Byte	getProductIsDelete(){
        return	productIsDelete;
    }

    public void	setProductId(Integer productId){
        this.productId = productId;
    }

    public void	setProductName(String productName){
        this.productName = productName;
    }

    public void	setPic1(String pic1){
        this.pic1 = pic1;
    }

    public void	setPic2(String pic2){
        this.pic2 = pic2;
    }

    public void	setPic3(String pic3){
        this.pic3 = pic3;
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

    public void	setCharacters(String characters){
        this.characters = characters;
    }

    public void	setProductFunction(String productFunction){
        this.productFunction = productFunction;
    }

    public void	setProductShape(String productShape){
        this.productShape = productShape;
    }

    public void	setProductIsDelete(Byte productIsDelete){
        this.productIsDelete = productIsDelete;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
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
