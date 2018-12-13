package com.cb.sp.petstore.dao;


import com.cb.sp.petstore.entity.CommentEntity;

import java.util.List;

public interface CommentDAO {

	Boolean addComment(CommentEntity commentEntity);


	Boolean replyComment(CommentEntity commentEntity);


	Boolean deleteComment(Integer commentID);


	CommentEntity searchComments(Integer productID);


	List<CommentEntity> getAllProductComments(Integer productID);


	List<CommentEntity> getALLComments();
}
