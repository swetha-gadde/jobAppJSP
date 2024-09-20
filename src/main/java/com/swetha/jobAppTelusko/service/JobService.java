package com.swetha.jobAppTelusko.service;

import com.swetha.jobAppTelusko.model.JobPost;
import com.swetha.jobAppTelusko.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;
    public void addJob(JobPost job) {
        jobRepo.addJob(job);
    }


    public List<JobPost> getAllJobs() {
        return jobRepo.getAllJobs();
    }
}
