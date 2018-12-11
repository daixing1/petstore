package com.cb.sp.petstore.dao;

import java.sql.ResultSet;
import java.util.List;

import VO.user;

public interface UserDAO {

	int insertUser(String userName, String password);


	boolean deleteUser(int userID);


	boolean modifyName(int userID, String name);


	boolean modifysex(int userID, int sex);


	boolean modifyage(int userID, int age);


	boolean modifypwd(int userID, String password);


	boolean modifyintro(int userID, String introduction);


	boolean modifytele(int userID, String telephone);


	boolean modifyaddr(int userID, String address);


	user getuser(String username);


	user getUserByID(int userID);

	String getUserName();

	int addUser(String userName, String password);

	List<user> getALLUser();

	int insertUSER(String userName, String password, String nicheng, int sex);


	boolean modifycost(int userID, int cost);

}
