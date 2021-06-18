package com.khc.study.domain.service;

import com.khc.study.domain.model.entity.Post;
import com.khc.study.domain.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * PostService
 */
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Page<Post> getPostList(Pageable pageable) {
        return postRepository.getPostList(pageable);
    }

    public Post writePost(Post post) {
        return postRepository.writePost(post);
    }

    public boolean deletePost(int id) {
        return postRepository.deletePost(id);
    }
    
}
