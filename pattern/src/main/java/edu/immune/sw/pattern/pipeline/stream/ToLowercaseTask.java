package edu.immune.sw.pattern.pipeline.stream;

import edu.immune.sw.pattern.pipeline.Task;

public class ToLowercaseTask implements Task<String, String> {

    @Override
    public String execute(String input) {
        System.out.println("Converting letters to lowercase");
        if(input == null || input.isEmpty())
            return "";

        return input.toLowerCase();
    }
}
