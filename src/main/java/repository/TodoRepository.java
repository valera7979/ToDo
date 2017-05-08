package repository;

import model.Todo;

import java.util.List;

/**
 * Created by Валера on 08.05.2017.
 */
public interface TodoRepository {

    List<Todo> getAll();

}
