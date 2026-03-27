package edu.immune.sw.pattern.pipeline;

public class Pipeline<I, O> {

    private final Task<I, O> currentTask;

    public Pipeline(Task<I, O> task) {
        this.currentTask = task;
    }

    public <K> Pipeline<I, K> addTask(Task<O, K> task) {
        return new Pipeline<>(new Task<I, K>() {
            @Override
            public K execute(I input) {
                return task.execute(currentTask.execute(input));
            }
        });
    }

    public O run(I input) {
        return currentTask.execute(input);
    }
}