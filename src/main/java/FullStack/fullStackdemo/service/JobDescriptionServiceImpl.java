package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.JobDescription;
import FullStack.fullStackdemo.repository.JobDescriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class JobDescriptionServiceImpl implements JobDescriptionService {

    @Autowired
    public JobDescriptionRepo jobRepo;

    @Override
    public List<JobDescription> getAllJobDescriptions() {
        return jobRepo.findAll() ;
    }

    @Override
    public JobDescription getJobDescriptionById( long id) {
        return jobRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found"));
    }


    @Override
    public JobDescription createJobDescription(JobDescription jobDescription) {
        return jobRepo.save(jobDescription);
    }

    @Override
    public void deleteJobDescriptionById(int id) {

    }
}
