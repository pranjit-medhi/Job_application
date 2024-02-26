package com.main.service;

import com.main.entity.Job;
import com.main.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JobServiceImpl implements JobService {
    private JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    private List<Job> jobs = new ArrayList<>();
    @Override
    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public String createJob(Job job) {


        jobRepository.save(job);
        return "job created";

    }

    @Override
    public Job findJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteJobById(Long id) {
        jobRepository.deleteById(id);
    }

    @Override
    public Job updateJob(Long id, Job job) {
        return null;
    }

}
