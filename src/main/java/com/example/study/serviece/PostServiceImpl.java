package com.example.study.serviece;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.domain.Post;
import com.example.study.repository.PostRepository;

@Service("postService")
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post add(Post post) {
        post = postRepository.save(post);
        return post;
    }

}