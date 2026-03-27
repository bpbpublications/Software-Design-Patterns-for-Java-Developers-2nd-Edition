package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.strategy.TextFormat;
import edu.immune.sw.pattern.strategy.TextToMapConversionService;

public class TestStrategy {
    public static void main(String[] args) {
        String json = "{ \"code\": \"strategy\" }";
        String xml = "<code>strategy</code>";
        TextToMapConversionService service = new TextToMapConversionService();
        service.convert(json, TextFormat.JSON);
        service.convert(xml, TextFormat.XML);
    }
}
