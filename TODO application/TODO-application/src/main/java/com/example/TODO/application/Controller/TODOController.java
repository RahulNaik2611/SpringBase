package com.example.TODO.application.Controller;

import com.example.TODO.application.Entity.Todo;
import com.example.TODO.application.Service.TODOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TODOController {

    @Autowired
    private TODOService todoService;

    // Load form and show list
    @GetMapping("/")
    public String loadForm(Model model) {
        List<Todo> todoList = todoService.getAlltodo();
        model.addAttribute("listtodo", todoList);
        model.addAttribute("todo", new Todo()); // to bind form input
        return "task"; // task.html
    }

    // Save or Update TODO
    @PostMapping("/addtodo")
    public String createTODO(@ModelAttribute Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:/"; // After saving, go back to home page
    }

    // Update completion status
    @PostMapping("/updatestatus")
    public String updateStatus(@RequestParam long id, @RequestParam(required = false) boolean completionStatus) {
        todoService.updateStatus(id, completionStatus);
        return "redirect:/";
    }

    // Edit a TODO (pre-fills the form)
    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable Long id, Model model) {
        Todo todo = todoService.getTodoById(id);
        model.addAttribute("todo", todo);
        model.addAttribute("listtodo", todoService.getAlltodo());
        return "task"; // Go back to task.html with the pre-filled data
    }

    // Delete a TODO
    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return "redirect:/";
    }
}
