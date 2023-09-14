package com.example.study.web.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.domain.Post;
import com.example.study.serviece.PostService;

@RequestMapping("/REST/post")
@RestController("postREST")
public class PostREST {

    @Autowired
    PostService postService;

    /* 
     * 게시글을 등록하는 엔드포인트 입니다.
     * 
     * @param Post 
     * @return Post 
     */
    public ResponseEntity<Post> add(Post post) {
        try {
            // post 등록
            Post dbPost = postService.add(post);
            return new ResponseEntity<Post>(dbPost, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<Post>(HttpStatus.NO_CONTENT);
        }
    }
    
}
