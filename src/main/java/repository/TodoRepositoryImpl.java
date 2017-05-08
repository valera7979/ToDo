package repository;

import model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Валера on 08.05.2017.
 */
@Repository
public class TodoRepositoryImpl implements TodoRepository {

    public List<Todo> getAll() {
        return null;
    }
}
