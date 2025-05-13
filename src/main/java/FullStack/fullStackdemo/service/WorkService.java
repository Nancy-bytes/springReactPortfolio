package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Work;

import java.util.List;

public interface WorkService {
    public Work workId(long id);
    public List<Work> findAllWorks();
    public Work createWork(Work work);
    public void deleteWork(long id);
}
