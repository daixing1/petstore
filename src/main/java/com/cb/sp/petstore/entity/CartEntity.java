package com.cb.sp.petstore.entity;

public class CartEntity{

	private	Integer	cartId;

	private	Integer	userId;

	private	Integer	productId;

	private	Integer	productNum;

	private	Integer	state;

	private	String	productName;

	private	Long	price;

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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
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
		return "CartEntity{" +
				"cartId=" + cartId +
				", userId=" + userId +
				", productId=" + productId +
				", productNum=" + productNum +
				", state=" + state +
				", productName='" + productName + '\'' +
				", price=" + price +
				'}';
	}
}