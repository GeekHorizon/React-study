package com.khc.study.presentation.controller.rest;

import com.khc.study.domain.model.entity.Comment;
import com.khc.study.domain.service.CommentService;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;
    
    @RequestMapping(value = "/post/{id}/comment", method = RequestMethod.POST) 
    public void writeComment(@RequestParam Long postId, @RequestBody Comment comment) {
        commentService.writeComment(postId, comment);
    }


}
