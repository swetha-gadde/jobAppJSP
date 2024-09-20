package com.swetha.jobAppTelusko.repo;

import com.swetha.jobAppTelusko.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> allJobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Java Developer2", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Jav", "J2EE", "Spring Boot", "Hibernate"))
    ));
    public void addJob(JobPost job) {
        allJobs.add(job);
    }


    public List<JobPost> getAllJobs() {

        return allJobs;
    }
}
