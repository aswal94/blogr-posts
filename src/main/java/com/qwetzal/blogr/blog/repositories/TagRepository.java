package com.qwetzal.blogr.blog.repositories;

import com.qwetzal.blogr.blog.entitiy.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
