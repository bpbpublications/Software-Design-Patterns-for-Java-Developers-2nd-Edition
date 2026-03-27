package edu.immune.sw.pattern.strategy;

import java.util.Map;

public interface TextToMapConverter {

    Map<String, String> convert(String text);

    void validate(String text) throws IllegalArgumentException;

}
