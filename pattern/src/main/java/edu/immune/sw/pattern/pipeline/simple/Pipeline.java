package edu.immune.sw.pattern.pipeline.simple;

import java.util.LinkedList;
import java.util.List;

public class Pipeline {

    private final List<Task> taskList = new LinkedList<>();

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void run() {
        for(Task task: taskList) {
            task.execute();
        }
    }
}