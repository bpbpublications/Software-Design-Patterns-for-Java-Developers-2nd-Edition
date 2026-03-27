package edu.immune.sw.pattern.pipeline.simple;

public class Test {

    public static void main(String[] args) {
        Task task1 = new PaymentTask<>("payment");
        Task task2 = new PaymentTask<>("refund");

        Pipeline pipeline = new Pipeline();
        pipeline.addTask(task1);
        pipeline.addTask(task2);

        pipeline.run();
    }

}
