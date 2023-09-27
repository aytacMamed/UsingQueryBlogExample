package com.changeside.blogqueryspringboot;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    List<Blog> findByPublished(boolean isPublished);
    List<Blog> findByTitleLike(String title);
    List<Blog> findByLevelGreaterThanEqual(int level);
}
