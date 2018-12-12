package com.cb.sp.petstore.facade;

import com.cb.sp.petstore.entity.CommentEntity;

import java.util.List;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/12 14:44
 */
public interface CommentFacade {

    Boolean addComment(CommentEntity commentEntity);

    Boolean replyComment(CommentEntity commentEntity);

    List<CommentEntity> getAllProductComment(Integer productId);

}