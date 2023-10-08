package com.example.springproject.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {

    public static List<Todo> todoList = new ArrayList<>();
    public static int todoCount=3;

    static{
        todoList.add(new Todo(1,"Test1","Test1 Description",new Date(03/02/2023),false));
        todoList.add(new Todo(2,"Test2","Test2 Description",new Date(04/02/2023),false));
        todoList.add(new Todo(3,"Test3","Test3 Description",new Date(05/02/2023),false));
    }

    public void addTodo(String user, String description, Date targetDate, boolean isDone ){
        todoList.add(new Todo(++todoCount,user,description,targetDate,isDone));
    }


    public void deleteTodo(int id){
        Iterator<Todo> iterator = todoList.iterator();
        while(iterator.hasNext()){
            Todo todo= iterator.next();
            if(todo.getId()==id){
                iterator.remove();
            }

        }
    }

    public List<Todo> retrieveTodo(String user){
        List<Todo> listOfTodo = new ArrayList<>();
        for(Todo todo:todoList){
            if(todo.getUser().equals(user))
                listOfTodo.add(todo);
        }
        return listOfTodo;
    }
}
