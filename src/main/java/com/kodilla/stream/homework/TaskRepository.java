package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> taskRepository = new ArrayList<>();
        taskRepository.add(new Task("Wystawienie faktur", LocalDate.of(2019, 12, 12), LocalDate.of(2019, 12, 31)));
        taskRepository.add(new Task("Wysyłka paczek", LocalDate.of(2019, 11 , 1), LocalDate.of(2020, 1, 5)));
        taskRepository.add(new Task("Rejestracja zleceń", LocalDate.of(2019, 12, 1), LocalDate.of(2019, 12, 15)));
        taskRepository.add(new Task("Napisanie maili do klientów", LocalDate.of(2019, 10, 22), LocalDate.of(2019, 10, 28)));
        return taskRepository;
    }

}
