package com.example.springproject.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value="/list_todo", method= RequestMethod.GET)
    public String showTodoList(ModelMap model){
        model.addAttribute("todo",todoService.retrieveTodo("Test1"));
        return "listTodo";
    }
}
