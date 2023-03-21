package com.qwetzal.blogr.blog.services.impl;

import com.qwetzal.blogr.blog.dto.PostRequestDto;
import com.qwetzal.blogr.blog.entitiy.Category;
import com.qwetzal.blogr.blog.entitiy.Post;
import com.qwetzal.blogr.blog.exceptions.PostNotFoundException;
import com.qwetzal.blogr.blog.repositories.CategoryRepository;
import com.qwetzal.blogr.blog.repositories.PostRepository;
import com.qwetzal.blogr.blog.services.PostService;
import com.qwetzal.blogr.blog.utils.SlugUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private final Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post savePost(PostRequestDto postRequestDto) {
        logger.info("savePost()");
        logger.debug("Post Request: {{}}", postRequestDto);
        logger.debug("Post categories: {{}}", postRequestDto.getCategories());

//        List<Category> foundCategoriesInDb = categoryRepository
//                .getCategoriesByName(postRequestDto.getCategories());
//
//        List<Long> categoriesIdInDb = foundCategoriesInDb.stream()
//                .mapToLong(Category::getId)
//                .boxed()
//                .toList();

//        Set<String> uniqueCategoriesFromRequest = postRequestDto.getCategories().stream().
//                .collect(Collectors.toCollection(HashSet::new));

        // A - B

        //postRepository.saveAll();






//        long[] categoriesIds = categoriesIdInDb.stream().mapToLong(id -> id).toArray();



        List<String> tags = postRequestDto.getTags();


        // Mapping postRequestDto dto -> post
        Post post = new Post();
        post.setTitle(postRequestDto.getTitle());
        post.setSlug(SlugUtility.generateSlug(postRequestDto.getTitle()));
        post.setBody(postRequestDto.getBody());
        post.setCategories(null);
        post.setTags(tags);

        return postRepository.save(post);
    }

    @Override
    public Post getPostById(Long id) {
        Optional<Post> post = postRepository
                .findById(id);
        if (!post.isEmpty()) {
            return post.get();
        } else {
            throw new PostNotFoundException(id);
        }
    }

    @Override
    public Post getPostBySlug(String slug) {
        return null;
    }

    @Override
    public Post updatePostBySlub(String slug) {
        return null;
    }

    @Override
    public Post deletePostById(Long id) {
        return null;
    }

    @Override
    public Post deletePostBySlug(String slug) {
        return null;
    }
}
