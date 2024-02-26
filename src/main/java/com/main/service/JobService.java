package com.main.service;

import com.main.entity.Job;

import java.util.List;

public interface JobService {
    List<Job> findAllJobs();
    String createJob(Job job);

    Job findJobById(Long id);
    void deleteJobById(Long id);
    Job updateJob(Long id, Job job);

}
