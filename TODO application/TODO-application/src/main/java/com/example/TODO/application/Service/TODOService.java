package com.example.TODO.application.Service;

import com.example.TODO.application.Entity.Todo;
import com.example.TODO.application.Repository.TODORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TODOService {

    @Autowired
    private TODORepository todoRepository;

    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> getAlltodo() {
        return todoRepository.findAll();
    }

    public void updateStatus(long id, boolean completionStatus) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TODO not found with id: " + id));
        todo.setCompletionStatus(completionStatus);
        todoRepository.save(todo);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TODO not found with id: " + id));
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
