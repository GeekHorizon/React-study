package com.khc.study.domain.service;

import javax.transaction.Transactional;

import com.khc.study.domain.model.entity.Comment;
import com.khc.study.domain.model.entity.Post;
import com.khc.study.domain.model.entity.Comment;
import com.khc.study.domain.repository.CommentRepositiory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    
    @Autowired
    private CommentRepositiory commentRepositiory;

    @Autowired
    private PostService postService;
    
    @Transactional
    public Comment writeComment(Long postId, Comment comment) {
        Post post = postService.getPostById(postId);
        comment.setPost(post);
        commentRepositiory.save(comment);
        return comment;
    }


    




}
