package com.changeside.blogqueryspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Long> {
    @Query("SELECT t FROM Blog t")
    List<Blog> findAll();

    @Query("SELECT t FROM Blog t WHERE t.published=?1")
    List<Blog> findByPublished(boolean isPublished);

    @Query("SELECT t FROM Blog t WHERE t.title LIKE %?1%")
    List<Blog> findByTitleLike(String title);
    @Query("SELECT t FROM Blog t WHERE t.level >= ?1")
    List<Blog> findByLevelGreaterThanEqual(int level);

}
