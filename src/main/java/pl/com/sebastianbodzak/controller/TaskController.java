package pl.com.sebastianbodzak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.sebastianbodzak.domain.Task;
import pl.com.sebastianbodzak.service.TaskService;

/**
 * Created by sbod on 31.01.2018.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return taskService.list();
    }
}
