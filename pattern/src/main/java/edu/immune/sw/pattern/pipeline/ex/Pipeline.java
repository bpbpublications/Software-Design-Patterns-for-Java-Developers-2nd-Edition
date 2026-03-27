package edu.immune.sw.pattern.pipeline.ex;

class Pipeline<I, O> {

    private final Handler<I, O> currentHandler;

    Pipeline(Handler<I, O> currentHandler) {
        this.currentHandler = currentHandler;
    }

    <K> Pipeline<I, K> addHandler(Handler<O, K> newHandler) {
        return new Pipeline<>(new Handler<I, K>() {
            @Override
            public K process(I input) {
                return newHandler.process(currentHandler.process(input));
            }
        });
//        return new Pipeline<>(input -> newHandler.process(currentHandler.process(input)));
    }

    O execute(I input) {
        return currentHandler.process(input);
    }
}