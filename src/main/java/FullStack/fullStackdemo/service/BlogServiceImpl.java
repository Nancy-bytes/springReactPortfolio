package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Blog;
import FullStack.fullStackdemo.exception.EntityExceptionNotFound;
import FullStack.fullStackdemo.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepo blogRepo;
    @Override
    public Blog findBlogById(@PathVariable long id) {
        return blogRepo.findById(id)
                .orElseThrow(()->new EntityExceptionNotFound("blog not found"));
    }

    @Override
    public Blog findBlogByTitle(String title) {
        return blogRepo.findByTitle(title);
    }

    @Override
    public List<Blog> findAllBlogs() {
        return blogRepo.findAll();
    }

    @Override
    public Blog updateBlog(Blog blog) {
        return blogRepo.save(blog);
    }

    @Override
    public void deleteBlogById(long id) {
        blogRepo.deleteById(id);

    }
}
