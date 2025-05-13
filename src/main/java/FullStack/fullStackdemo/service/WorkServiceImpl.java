package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Work;
import FullStack.fullStackdemo.repository.WorkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    public WorkRepo workRepo;
    @Override
    public Work workId( long id) {
        return workRepo.findById(id).orElseThrow(()-> new RuntimeException("work id not found"));
    }

    @Override
    public List<Work> findAllWorks() {
        return workRepo.findAll();
    }

    @Override
    public Work createWork(Work work) {
        return workRepo.save(work);
    }

    @Override
    public void deleteWork(long id) {
        workRepo.deleteById(id);
    }
}
