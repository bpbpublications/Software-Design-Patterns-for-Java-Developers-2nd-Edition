package edu.immune.sw.pattern.pipeline.simple;

public class PaymentTask<T> extends AbstractTask<T> {

    public PaymentTask(T input) {
        this.input = input;
    }

    @Override
    public void execute() {

    }
}
