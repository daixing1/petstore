package com.cb.sp.petstore.dao;

import java.sql.ResultSet;
import java.util.List;

import VO.products;

public interface ProductDAO {

	List<products> getAllProduct();


	boolean insertProduct(String prodName, int prodPrice, int prodNum, String prodIntrod,
                                 int prodType, int prodAge, String prodVariety, String prodArea, int prodRecomm, String prodCharac,
                                 String prodFunc, String prodShape);


	boolean deleteProduct(int prodID);


	product getProduct(int prodID);

	product getProductByName(String prodNAme);

	boolean modifyProdName(int prodID, String prodName);

	boolean modifyProdCHA(int prodID, String prodName);

	boolean modifyProdPrice(int prodID, int prodPrice);


	boolean modifyProdNum(int prodID, int prodNum);


	boolean modifyProdIntro(int prodID, String prodIntro);


    boolean setRecom(int prodID);


	boolean cancelRecom(int prodID);


	String getProdName(int prodID);


	List<products> searchProdByType(int prodType);


	List<products> searchProdByArea(String prodArea);


	List<products> searchProdByArea1(String prodArea);


	List<products> searchProdByType2(int prodType);


	List<products> searchProdByShape(String prodShape);


	List<products> searchProdByShape1(String prodShape);


	List<products> searchProdByShape2(String prodShape);

	List<products> searchProdByAge(int prodAge1, int prodAge2);


	List<products> searchProdByPrice(int prodPrice1, int prodPrice2);


	List<products> searchProdByCharaType1(String prodCharacter);


	List<products> searchProdByCharaType2(String prodCharacter);


	List<products> searchProdByFun(String prodFunction);


	List<products> searchProdByVariety(String prodVariety);


	List<products> searchProdByTypeAndAge(int prodType, int prodAge);


	List<products> searchProdByTypeAndVariety(int prodType, String prodVariety);


	List<products> searchProdByTypeAndPrice(int prodType, int prodPrice);


	List<products> searchProdByVarietyAndAge(String prodVariety, int prodAge);


	List<products> searchProdByPriceAndAge(int prodPrice, int prodAge);


	List<products> searchProdByPriceAndVariety(int prodPrice, String prodVariety);


	List<products> searchProdByTypeAndAgeAndPrice(int prodType, int prodAge, int prodPrice);


	List<products> searchProdByTypeAndVarietyAndAge(int prodType, String prodVariety, int prodAge);


	List<products> searchProdByAgeAndVarietyAndPrice(int prodAge, String prodVariety, int prodPrice);


	List<products> searchProdByTypeAndVarietyAndPrice(int prodType, String prodVariety, int prodPrice);


	List<products> searchProdByTypeAndVarietyAndAgeAndPrice(int prodType, String prodVariety, int prodAge,
                                                                   int prodPrice);

	List<products> searchMohu(String prodAA);
	

	boolean modifyProdNum1(int prodID, int prodNum);
}
