package pl.com.sebastianbodzak.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by sbod on 31.01.2018.
 */
@Entity
@Data
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dueDate;
    private boolean competed;


}
