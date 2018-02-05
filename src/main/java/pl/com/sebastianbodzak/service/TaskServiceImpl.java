package pl.com.sebastianbodzak.service;

import pl.com.sebastianbodzak.domain.Task;
import pl.com.sebastianbodzak.repostiory.TaskRepository;

/**
 * Created by sbod on 31.01.2018.
 */
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }
}
