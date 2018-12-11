package com.cb.sp.petstore.entity;

import java.sql.Timestamp;

public class CommentEntity{

	private	Integer	commentId;

	private	Integer	userId;

	private	Integer	productId;

	private	Timestamp	time;

	private	String	comment;

	private	Integer	replyId;

	private	Byte	delete;

	public	Integer	getCommentId(){
		return	commentId;
	}

	public	Integer	getUserId(){
		return	userId;
	}

	public	Integer	getProductId(){
		return	productId;
	}

	public	Timestamp	getTime(){
		return	time;
	}

	public	String	getComment(){
		return	comment;
	}

	public	Integer	getReplyId(){
		return	replyId;
	}

	public	Byte	getDelete(){
		return	delete;
	}

	public void	setCommentId(Integer commentId){
		this.commentId = commentId;
	}

	public void	setUserId(Integer userId){
		this.userId = userId;
	}

	public void	setProductId(Integer productId){
		this.productId = productId;
	}

	public void	setTime(Timestamp time){
		this.time = time;
	}

	public void	setComment(String comment){
		this.comment = comment;
	}

	public void	setReplyId(Integer replyId){
		this.replyId = replyId;
	}

	public void	setDelete(Byte delete){
		this.delete = delete;
	}

	@Override
	public String toString() {
		return "CommentEntity{" +
				"commentId=" + commentId +
				", userId=" + userId +
				", productId=" + productId +
				", time=" + time +
				", comment='" + comment + '\'' +
				", replyId=" + replyId +
				", delete=" + delete +
				'}';
	}
}