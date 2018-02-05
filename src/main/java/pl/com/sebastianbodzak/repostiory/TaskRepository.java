package pl.com.sebastianbodzak.repostiory;

import org.springframework.data.repository.CrudRepository;
import pl.com.sebastianbodzak.domain.Task;

/**
 * Created by sbod on 31.01.2018.
 */
public interface TaskRepository extends CrudRepository<Task, Long> {

    

}
