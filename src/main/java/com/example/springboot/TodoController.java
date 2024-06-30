package com.example.springboot;


import java.util.ArrayList;
import java.util.List;

public class TodoController {
    private static List<Todo> todos;

    public TodoController() {
//        todos = new ArrayList<String>();
        todos = new ArrayList<>();
        todos.add(new Todo(1, false, "Todo-1", 1));
        todos.add(new Todo(2, true, "Todo-2", 2));
    }
}
