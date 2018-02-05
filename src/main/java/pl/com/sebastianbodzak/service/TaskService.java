package pl.com.sebastianbodzak.service;

import pl.com.sebastianbodzak.domain.Task;

/**
 * Created by sbod on 31.01.2018.
 */
public interface TaskService {

    Iterable<Task> list();

}
