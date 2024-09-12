package com.dev.taskservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.taskservice.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findByassignedUserId(Long userId);
}
