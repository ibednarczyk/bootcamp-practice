package com.kodilla.hibernate.tasklist.repository;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;
    private static final String DESCRIPTION = "Deadline next week";

    @Test
    public void testFindByListName(){
        //given
        TaskList taskList = new TaskList("TO DO", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();
        //when
        List<TaskList> foundList = taskListRepository.findByListName(listName);
        //given
        Assert.assertEquals(1, foundList.size());
        //clean up
        int id = foundList.get(0).getId();
        taskListRepository.deleteById(id);


    }
}
