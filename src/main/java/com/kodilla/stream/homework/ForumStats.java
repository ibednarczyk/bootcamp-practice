package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >=40)
                .map(n->n.getNumberOfPosts())
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        System.out.println(avgOver40);

        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() <40)
                .map(n->n.getNumberOfPosts())
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        System.out.println(avgUnder40);

    }
}
