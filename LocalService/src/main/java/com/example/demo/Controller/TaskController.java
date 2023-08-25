package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TaskService;
import com.example.demo.model.Task;

@RestController
@RequestMapping("/local")
public class TaskController {
	        @Autowired
		    private TaskService taskService;

		    @GetMapping("/")
		    public List<Task> getAllLocal() {
		        return taskService.getAllLocal();
		    }

		    @GetMapping("/getUser")
		    public Task getLocalById(@PathVariable Long id) {
		        return taskService.getLocalById(id);
		    }

		    @PostMapping("/addUser")
		    public Task createLocal(@RequestBody  Task task) {
		        return taskService.createLocal(task);
		    }

		    @PutMapping("/updateUser/{id}")
		    public Task updateLocal(@PathVariable Long id, @RequestBody Task updatedLocal) {
		        return taskService.updateLocal(id, updatedLocal);
		    }

		    @DeleteMapping("/deleteUser/{id}")
		    public void deleteTrain(@PathVariable Long id) {
		        taskService.deleteLocal(id);
		        }
		    }
