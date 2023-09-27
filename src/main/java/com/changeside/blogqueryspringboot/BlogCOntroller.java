package com.changeside.blogqueryspringboot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogs")
@RequiredArgsConstructor
public class BlogCOntroller {
    private final BlogManager blogManager;

    @GetMapping
    List<Blog> findAll(){
      return   blogManager.findAll();
    }
    @GetMapping("/published")
    List<Blog> findByPublished(@RequestParam("published") boolean isPublished){
        return blogManager.findByPublished(isPublished);
    };
    @GetMapping("/title")
    List<Blog> findByTitleLike(@RequestParam("title") String title){
        return blogManager.findByTitleLike(title);
    };
    @GetMapping("/levell")
    List<Blog> findByLevelGreaterThanEqual(@RequestParam("levell") int level){
        return blogManager.findByLevelGreaterThanEqual(level);
    };
}
