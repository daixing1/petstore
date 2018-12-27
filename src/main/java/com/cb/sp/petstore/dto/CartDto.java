package com.cb.sp.petstore.dto;

import java.io.Serializable;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/27 10:51
 */
public class CartDto implements Serializable {

    private static final long serialVersionUID = -3037251907235107206L;

    private	String	pic1;

    private	String	pic2;

    private	String	pic3;

    private	Integer	cartId;

    private	Integer	userId;

    private	Integer	productId;

    private	Integer	productNum;

    private	Byte	state;

    private	String	productName;

    private	Long	price;

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

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
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

    @Override
    public String toString() {
        return "CartDto{" +
                "pic1='" + pic1 + '\'' +
                ", pic2='" + pic2 + '\'' +
                ", pic3='" + pic3 + '\'' +
                ", cartId=" + cartId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", productNum=" + productNum +
                ", state=" + state +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
