package service;

import model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TodoRepository;

import java.util.List;

/**
 * Created by Валера on 08.05.2017.
 */
@Service
public class TodoServiceImpl implements TodoService {

    TodoRepository repository;

    @Autowired
            public TodoServiceImpl(TodoRepository repository) {
                this.repository = repository;
            }

    public List<Todo> getAll() {
        return repository.getAll();
    }
}
