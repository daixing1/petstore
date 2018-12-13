package com.cb.sp.petstore.facade.impl;

import com.cb.sp.petstore.biz.CommentBiz;
import com.cb.sp.petstore.dao.CommentDAO;
import com.cb.sp.petstore.entity.CommentEntity;
import com.cb.sp.petstore.facade.CommentFacade;
import com.cb.sp.petstore.util.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/12 14:45
 */
@RestController
@RequestMapping("comment")
public class CommentFacadeImpl implements CommentFacade {

    @Autowired
    CommentBiz commentBiz;
    @Autowired
    CommentDAO commentDAO;

    @Override
    @PostMapping("addComment")
    public Boolean addComment(@RequestBody CommentEntity commentEntity) {
        return commentDAO.addComment(commentEntity);
    }

    @Override
    @PostMapping("replyComment")
    public Boolean replyComment(@RequestBody CommentEntity commentEntity) {
        if (null == commentEntity.getReplyId()){
            throw new BizException("回复ID不能为空");
        }
        return commentDAO.replyComment(commentEntity);
    }

    @Override
    @GetMapping("getAllProductComment")
    public List<CommentEntity> getAllProductComment(@RequestParam("productId") Integer productId) {
        return commentDAO.getAllProductComments(productId);
    }
}