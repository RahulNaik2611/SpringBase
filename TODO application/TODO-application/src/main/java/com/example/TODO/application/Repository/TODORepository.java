package com.example.TODO.application.Repository;

import com.example.TODO.application.Entity.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TODORepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Todo todo) {
        if (todo.getId() == 0) {
            entityManager.persist(todo); // For new tasks
        } else {
            entityManager.merge(todo); // For updates
        }
    }

    public List<Todo> findAll() {
        TypedQuery<Todo> query = entityManager.createQuery("FROM Todo", Todo.class);
        return query.getResultList();
    }

    public Optional<Todo> findById(Long id) {
        Todo todo = entityManager.find(Todo.class, id);
        return Optional.ofNullable(todo);
    }

    @Transactional
    public void deleteById(Long id) {
        Todo todo = entityManager.find(Todo.class, id);
        if (todo != null) {
            entityManager.remove(todo);
        }
    }
}
