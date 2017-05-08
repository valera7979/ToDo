package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TodoService;

/**
 * Created by Валера on 08.05.2017.
 */
@Controller
public class TodoController {

TodoService service;

@Autowired
public TodoController(TodoService service) {
    this.service = service;
}

@RequestMapping ("/todo")
    public String getAll(Model model) {
    model.addAttribute("todos",service.getAll());
    return "todo";
}

}
