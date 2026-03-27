package edu.immune.sw.pattern.pipeline.ex;

interface Handler<I, O> {
    O process(I input);
}