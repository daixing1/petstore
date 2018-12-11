package com.cb.sp.petstore.entity;

public class CartEntity{

	private	Integer	cartId;

	private	Integer	userId;

	private	Integer	productId;

	private	Integer	productNum;

	private	Integer	state;

	private	String	productName;

	private	Long	price;

	public	Integer	getCartId(){
		return	cartId;
	}

	public	Integer	getUserId(){
		return	userId;
	}

	public	Integer	getProductId(){
		return	productId;
	}

	public	Integer	getProductNum(){
		return	productNum;
	}

	public	Integer	getState(){
		return	state;
	}

	public	String	getProductName(){
		return	productName;
	}

	public	Long	getPrice(){
		return	price;
	}

	public void	setCartId(Integer cartId){
		this.cartId = cartId;
	}

	public void	setUserId(Integer userId){
		this.userId = userId;
	}

	public void	setProductId(Integer productId){
		this.productId = productId;
	}

	public void	setProductNum(Integer productNum){
		this.productNum = productNum;
	}

	public void	setState(Integer state){
		this.state = state;
	}

	public void	setProductName(String productName){
		this.productName = productName;
	}

	public void	setPrice(Long price){
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