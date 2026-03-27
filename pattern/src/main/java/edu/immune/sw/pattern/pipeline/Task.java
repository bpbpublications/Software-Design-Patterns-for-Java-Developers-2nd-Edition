package edu.immune.sw.pattern.pipeline;

public interface Task<I, O> {
    O execute(I input);
}