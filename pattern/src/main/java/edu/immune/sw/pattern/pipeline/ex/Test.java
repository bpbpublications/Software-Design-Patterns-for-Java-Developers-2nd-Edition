package edu.immune.sw.pattern.pipeline.ex;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println("Creating pipeline");
        var filters = new Pipeline<>(new DuplicateHandler())
                .addHandler(new ToLowerCaseHandler())
                .addHandler(new ConvertToCharArrayHandler());
        var input = "GoYankees123!";
        System.out.println("Executing pipeline with input: " + input);
        var output = filters.execute(input);
        System.out.println("Pipeline output: " + Arrays.toString(output));
    }
}
