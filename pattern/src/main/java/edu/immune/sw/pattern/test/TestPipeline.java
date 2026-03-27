package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.pipeline.Pipeline;
import edu.immune.sw.pattern.pipeline.stream.CountDistinctWordsTask;
import edu.immune.sw.pattern.pipeline.stream.FileReaderTask;
import edu.immune.sw.pattern.pipeline.stream.FilterTask;
import edu.immune.sw.pattern.pipeline.stream.ToLowercaseTask;

import java.io.File;
import java.util.Map;

public class TestPipeline {

//    public static void main(String[] args) {
//        System.out.println("Creating pipeline");
//        Pipeline<Cart, Order> operations = new Pipeline<>(new OrderPlacementTask())
//                .addTask(new PaymentFulfillmentTask())
//                .addTask(new NotificationTask());
//        Cart input = new Cart();
//        System.out.println("Executing pipeline with input: " + input);
//        Order output = operations.run(input);
//        System.out.println("Output from pipeline execution: " + output);
//    }

    public static void main(String[] args) {
        System.out.println("Creating pipeline");
        Pipeline<File, Map<String, Integer>> operations = new Pipeline<>(new FileReaderTask())
                .addTask(new FilterTask())
                .addTask(new ToLowercaseTask())
                .addTask(new CountDistinctWordsTask());
        File input = new File("pattern/src/main/java/edu/immune/sw/pattern/test/summary.txt");
        System.out.println("Executing pipeline for file: " + input.getName());
        Map<String, Integer> output = operations.run(input);
        System.out.println("Distinct words and their count: " + output);
    }
}

