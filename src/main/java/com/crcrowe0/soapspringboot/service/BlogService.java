package com.crcrowe0.soapspringboot.service;

import com.crcrowe0.soap_springboot.Blog;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class BlogService {

    private static final Map<String, Blog> blogs = new HashMap<>();

    @PostConstruct
    public void initialize() {
        Blog blog1 = new Blog();
        blog1.setTitle("Title1");
        blog1.setAuthor("Author1");
        blog1.setContent("This is the really cool content of the blog 1.");

        Blog blog2 = new Blog();
        blog2.setTitle("Title2");
        blog2.setAuthor("Author2");
        blog2.setContent("This is the really cool content of the blog 2.");

        Blog blog3 = new Blog();
        blog3.setTitle("Title3");
        blog3.setAuthor("Author3");
        blog3.setContent("This is the really cool content of the blog 3.");

        Blog blog4 = new Blog();
        blog4.setTitle("Title4");
        blog4.setAuthor("Author4");
        blog4.setContent("This is the really cool content of the blog 4.");

        blogs.put(blog1.getTitle(), blog1);
        blogs.put(blog2.getTitle(), blog2);
        blogs.put(blog3.getTitle(), blog3);
        blogs.put(blog4.getTitle(), blog4);
    }

    public static Blog getBlog(String title) {
        return blogs.get(title);
    }
}
