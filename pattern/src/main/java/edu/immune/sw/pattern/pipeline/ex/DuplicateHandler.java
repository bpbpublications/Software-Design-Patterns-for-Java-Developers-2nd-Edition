package edu.immune.sw.pattern.pipeline.ex;

class DuplicateHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        System.out.println("Duplicating String");
        return input.concat("_").concat(input);
    }
}