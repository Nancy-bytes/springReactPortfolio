//package FullStack.fullStackdemo.service;
//
//import FullStack.fullStackdemo.entity.Content;
//import FullStack.fullStackdemo.exception.EntityExceptionNotFound;
//import FullStack.fullStackdemo.repository.ContentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@Service
//public class ContentServiceImpl implements ContentService {
//    @Autowired
//    public ContentRepo contentRepo;
//
//    @Override
//    public Content getContentById(long id) {
//        return (Content) contentRepo.findById(id)
//                .orElseThrow(() -> new EntityExceptionNotFound("Content not found"));
//    }
//
//    @Override
//    public Content getContentByCategory(String category) {
//        return ;
//    }
//
//    @Override
//    public List<Content> getAllContent() {
//        return  contentRepo.findAll();
//    }
//
//    @Override
//    public Content createContent(Content content) {
//        return contentRepo.save(content);
//    }
//
//    @Override
//    public void deleteContent(long id) {
//        contentRepo.deleteById(id);
//    }
//}
