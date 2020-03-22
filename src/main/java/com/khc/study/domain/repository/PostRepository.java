package com.khc.study.domain.repository;

import java.util.Date;
import java.util.List;

import com.khc.study.domain.model.entity.Post;
import com.khc.study.infrastructure.dao.PostDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * PostRepository
 */
@Repository
public class PostRepository {

    @Autowired
    private PostDao postDao;


    public Page<Post> getPostList(Pageable pageable) {
        final Page<Post> postPage = postDao.findAll(pageable);
        return postPage;
    }

	public Post writePost(final Post post) {
        post.setRegDate(new Date());
		post.setUpdateDate(new Date());
		return postDao.save(post);
    }
    
    public Post getPostById(int id) throws IllegalArgumentException{
        Post post = postDao.getOne(id);

        if (post == null) {
            throw new IllegalArgumentException("Post not Found");
        }
        return post;
    }

    public boolean deletePost(int id) throws IllegalArgumentException {
        postDao.deleteById(id);

        try {
            postDao.getOne(id);
        } catch (IllegalArgumentException e) {
            return true;
        }
        return false;
    }


}