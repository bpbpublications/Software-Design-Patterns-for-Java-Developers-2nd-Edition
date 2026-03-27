package edu.immune.sw.pattern.strategy;

import java.util.Map;
import java.util.TreeMap;

public class YamlToMapConverter implements TextToMapConverter {

    @Override
    public Map<String, String> convert(String text) {
        validate(text);
        Map<String, String> parsedMap = new TreeMap<>();
        System.out.println("Converting Yaml to Map object");
        System.out.println("Adding converted values to result map");
        return parsedMap;
    }

    @Override
    public void validate(String text) throws IllegalArgumentException {
        System.out.println("Validating correctness of Yaml input");
    }
}
