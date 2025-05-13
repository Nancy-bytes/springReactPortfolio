package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    public Blog findBlogById(long id);
    public Blog findBlogByTitle(String title);
    public List<Blog> findAllBlogs();
    public Blog updateBlog(Blog blog);
    public void deleteBlogById(long id);
}
