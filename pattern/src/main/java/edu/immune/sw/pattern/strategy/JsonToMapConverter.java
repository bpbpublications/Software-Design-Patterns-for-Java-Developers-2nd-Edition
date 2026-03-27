package edu.immune.sw.pattern.strategy;

import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonToMapConverter implements TextToMapConverter {

    @Override
    public Map<String, String> convert(String text) {
        validate(text);
        Map<String, String> parsedMap = new LinkedHashMap<>();
        System.out.println("Converting Json to Map object");
        System.out.println("Filling result map after conversion");
        return parsedMap;
    }

    @Override
    public void validate(String text) throws IllegalArgumentException {
        System.out.println("Validating correctness of passed Json input");
    }
}
