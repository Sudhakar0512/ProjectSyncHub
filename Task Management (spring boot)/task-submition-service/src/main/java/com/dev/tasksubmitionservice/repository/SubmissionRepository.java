package com.dev.tasksubmitionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.tasksubmitionservice.model.Submission;

import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission,Long> {
    List<Submission> findByTaskId(Long taskId);
}
