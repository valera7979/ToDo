package repository;

import model.Todo;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Валера on 08.05.2017.
 */
@Repository
public class TodoRepositoryImpl implements TodoRepository {
    private static final Logger LOG = LoggerFactory.getLogger(TodoRepositoryImpl.class);

    @PersistenceContext
    EntityManager em;

    public List<Todo> getAll() {
        List<Todo> todos = em.createNamedQuery(Todo.ALL_SORTED, Todo.class).getResultList();
        LOG.info("{} todo`s was retrieved from DB", todos.size());
        return todos;

    }
}
