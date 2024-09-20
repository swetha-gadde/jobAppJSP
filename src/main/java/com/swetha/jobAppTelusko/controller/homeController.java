package com.swetha.jobAppTelusko.controller;

import com.swetha.jobAppTelusko.model.JobPost;
import com.swetha.jobAppTelusko.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class homeController {
    @Autowired
    private JobService jobService;
    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob(){

        return "addjob";
    }

    @PostMapping ("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        System.out.println("Handle form called");
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model m){
        List<JobPost> jobs  = jobService.getAllJobs();
        m.addAttribute("jobPosts", jobs);
        System.out.println(jobs);
        //return "";
        return "viewalljobs";
    }
}
