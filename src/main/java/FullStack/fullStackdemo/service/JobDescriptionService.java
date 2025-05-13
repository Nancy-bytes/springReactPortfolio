package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.JobDescription;

import java.util.List;

public interface JobDescriptionService {
    public List<JobDescription> getAllJobDescriptions();
    public JobDescription getJobDescriptionById(long id);
    public JobDescription createJobDescription(JobDescription jobDescription);
    public void deleteJobDescriptionById(int id);
}
