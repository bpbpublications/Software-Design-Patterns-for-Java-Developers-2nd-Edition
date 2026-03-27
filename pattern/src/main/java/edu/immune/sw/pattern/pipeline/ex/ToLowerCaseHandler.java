package edu.immune.sw.pattern.pipeline.ex;

class ToLowerCaseHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        System.out.println("Converting to lower case");
        return input.toLowerCase();
    }
}