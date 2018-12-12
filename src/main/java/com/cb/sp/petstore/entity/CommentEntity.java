package com.cb.sp.petstore.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class CommentEntity{

	private	Integer	commentId;

	private	Integer	userId;

	private	Integer	productId;

	private Date time;

	private	String	comment;

	private	Integer	replyId;

	private	Integer	isDelete;

	public	Integer	getCommentId(){
		return	commentId;
	}

	public	Integer	getUserId(){
		return	userId;
	}

	public	Integer	getProductId(){
		return	productId;
	}

	public	Date	getTime(){
		return	time;
	}

	public	String	getComment(){
		return	comment;
	}

	public	Integer	getReplyId(){
		return	replyId;
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

	public void	setTime(Date time){
		this.time = time;
	}

	public void	setComment(String comment){
		this.comment = comment;
	}

	public void	setReplyId(Integer replyId){
		this.replyId = replyId;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
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
				", isDelete=" + isDelete +
				'}';
	}
}