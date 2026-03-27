package edu.immune.sw.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class XmlToMapConverter implements TextToMapConverter {

    @Override
    public Map<String, String> convert(String text) {
        validate(text);
        Map<String, String> parsedMap = new HashMap<>();
        System.out.println("Converting Xml to Map object");
        System.out.println("Filling result map after conversion from Xml input");
        return parsedMap;
    }

    @Override
    public void validate(String text) throws IllegalArgumentException {
        System.out.println("Validating correctness of passed Xml input");
    }
}
