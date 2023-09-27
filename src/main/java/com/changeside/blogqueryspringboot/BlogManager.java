package com.changeside.blogqueryspringboot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogManager implements BlogService{
    private final BlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> findByPublished(boolean isPublished) {
        return blogRepository.findByPublished(isPublished);
    }

    @Override
    public List<Blog> findByTitleLike(String title) {
        return blogRepository.findByTitleLike(title);
    }

    @Override
    public List<Blog> findByLevelGreaterThanEqual(int level) {
        return blogRepository.findByLevelGreaterThanEqual(level);
    }

}
