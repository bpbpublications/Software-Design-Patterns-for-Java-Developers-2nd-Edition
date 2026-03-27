package edu.immune.sw.pattern.pipeline.stream;

import edu.immune.sw.pattern.pipeline.Task;

import java.util.*;

public class CountDistinctWordsTask implements Task<String, Map<String, Integer>> {

    @Override
    public Map<String, Integer> execute(String input) {
        System.out.println("Finding distinct words and their counts");
        String[] words = input.split(" ");

        Map<String, Integer> distinctWords = new HashMap<>();
        for(String w: words) {
            distinctWords.merge(w, 1, (k, v) -> v + 1);
        }


        return distinctWords;
    }
}
