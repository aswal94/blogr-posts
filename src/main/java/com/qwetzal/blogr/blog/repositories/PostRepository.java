package com.qwetzal.blogr.blog.repositories;

import com.qwetzal.blogr.blog.entitiy.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
