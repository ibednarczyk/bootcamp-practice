package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> listOfDeadlines = TaskRepository.getTasks()
                .stream()
                .filter(date -> date.getDeadline().isAfter(LocalDate.now()))
                .map(TaskManager::getTaskDeadline)
                .collect(Collectors.toList());
        System.out.println(listOfDeadlines);

    }

    public static LocalDate getTaskDeadline(Task task){
        return task.getDeadline();

    }
}
