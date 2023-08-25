package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TaskRepository;
import com.example.demo.model.Task;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TaskService {
		@Autowired
	    private TaskRepository taskRepository;

	    public List<Task> getAllLocal() {
	        return taskRepository.findAll();
	    }

	    public Task getLocalById(Long id) {
	        return taskRepository.findById(id).orElse(null);
	    }

	    public Task createLocal(Task task) {
	        return taskRepository.save(task);
	    }

	    public Task updateLocal(Long id, Task updatedLocal) {
	        if (taskRepository.existsById(id)) {
	            updatedLocal.setId(id);
	            return taskRepository.save(updatedLocal);
	        }
	        return null;
	    }

	    public void deleteLocal(Long id) {
	        taskRepository.deleteById(id);}}