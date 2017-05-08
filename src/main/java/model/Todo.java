package model;

import javax.persistence.Entity;
import java.time.LocalDateTime;

/**
 * Created by Валера on 08.05.2017.
 */
@Entity
public class Todo {

    private Integer id;

    private String description;

    private LocalDateTime started;

    private LocalDateTime expiration_date;

    private String status;

}
