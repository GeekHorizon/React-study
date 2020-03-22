package com.khc.study.presentation.controller.rest;
 
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import com.khc.study.domain.model.entity.Post;
import com.khc.study.domain.repository.PostRepository;
import com.khc.study.domain.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 
 */
@RestController
public class PostRestController {
    
    @Autowired
    private PostService postService;


    @RequestMapping(value = {"/post/list"}, method = RequestMethod.GET)
    public Page<Post> list(@PageableDefault(sort = { "id" }, direction = Direction.DESC, size = 5) Pageable pageable) {
        Page<Post> postPage = postService.getPostList(pageable);
        return postPage;
    }

    @RequestMapping(value = "/post/write", method = RequestMethod.GET)
    public Post writePost(Post post) {


        return postService.writePost(post);
    }

    @RequestMapping(value =  "/post/delete", method = RequestMethod.GET)
    public boolean deletePost(@RequestParam(name="id") int id) {
        postService.deletePost(id);
        
        return true;

    }
} 