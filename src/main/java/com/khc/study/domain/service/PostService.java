package com.khc.study.domain.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import com.khc.study.domain.model.dto.PostDto;
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
        return postRepository.findAll(pageable);
    }

    @Transactional
    public Post writePost(PostDto postDto) {
        Post post = new Post.Builder(postDto).build();
        post.setCreatedTimeAt(LocalDateTime.now());
        return postRepository.save(post);
    }

    @Transactional
	public Post editPost(PostDto postDto) {
		Post post = getPostById(postDto.getId());
        
        post.setContent(post.getContent());
        post.setUpdateTimeAt(LocalDateTime.now());
        post.setName(postDto.getName());
        post.setSubtitle(postDto.getSubtitle());

		return post;
	}

    public Post getPostById(long id) {
        return postRepository.getOne(id);
    }

    @Transactional
    public void deletePost(long id) throws IllegalArgumentException {
        postRepository.deleteById(id);
    }

}
