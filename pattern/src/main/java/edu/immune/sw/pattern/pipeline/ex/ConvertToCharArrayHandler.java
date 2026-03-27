package edu.immune.sw.pattern.pipeline.ex;

class ConvertToCharArrayHandler implements Handler<String, char[]> {
    @Override
    public char[] process(String input) {
        System.out.println("Converting to character array");
        return input.toCharArray();
    }
}