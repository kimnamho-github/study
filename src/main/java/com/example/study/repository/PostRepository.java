package com.example.study.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.study.domain.Post;

@Repository("postRepository")
public interface PostRepository extends PagingAndSortingRepository<Post, String> {
    Post getByIdx(int idx);
}