package com.main.controller;

import com.main.entity.Job;
import com.main.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("")
    public  List<Job> getAllJobs()
    {
        return  jobService.findAllJobs();
    }
    @PostMapping("/")
    public String createJobs(@RequestBody Job job)
    {
        return jobService.createJob(job);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id)
    {
        Job job = jobService.findJobById(id);
        return  new ResponseEntity<>(job,HttpStatus.OK);
    }
}
