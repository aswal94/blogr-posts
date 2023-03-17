package com.qwetzal.blogr.blog.repositories;

import com.qwetzal.blogr.blog.entitiy.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(value = "SELECT * FROM categories where name in (?categories)", nativeQuery = true)
    List<Category> getCategoriesByName(String[] categories);
}
