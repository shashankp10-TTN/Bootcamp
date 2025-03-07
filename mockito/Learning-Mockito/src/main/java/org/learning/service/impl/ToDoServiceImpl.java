package org.learning.service.impl;

import org.learning.service.ToDoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoServiceImpl {
    // testing toDoService without having toDoService available
    private ToDoService toDoService;

    public ToDoServiceImpl(ToDoService toDoService) {
        super();
        this.toDoService = toDoService;
    }

    public List<String> getTodosRelatedToSpring(String user) {
        List<String> todos = toDoService.getToDoList(user);
        List<String> filterToDos = todos
                                    .stream()
                                    .filter(e -> e.contains("Spring"))
                                    .toList();
        return filterToDos;
    }
}
