package com.example.springproject.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value="/list_todo", method= RequestMethod.GET)
    public String showTodoList(ModelMap model){
        //model.addAttribute("name",name);
        model.addAttribute("todo",todoService.retrieveTodo("Test1"));
        return "listTodo";
    }

    @RequestMapping(value="/add_todo",method = RequestMethod.GET)
    public String todoFormPage(){
        return "add_todo";
    }

    @RequestMapping(value="/add_todo",method = RequestMethod.POST)
    public String addTodo(@RequestParam String user ){
        todoService.addTodo(user,"Test5 User",new Date(03/02/2023),false);
        return "redirect:list_todo";
    }

    @RequestMapping(value="/delete_todo",method=RequestMethod.GET)
    public String deleteTodo(ModelMap model, @RequestParam int id){
        model.clear();
        todoService.deleteTodo(id);
        return "redirect:add_todo";
    }
}
