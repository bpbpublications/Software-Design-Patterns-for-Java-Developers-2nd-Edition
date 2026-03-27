package edu.immune.sw.pattern.strategy;

import java.util.Map;

public class TextToMapConversionService {

    public Map<String, String> convert(String text, TextFormat textFormat) {
        TextToMapConverter converter = ConversionStrategySelector.getStrategy(textFormat);
        return converter.convert(text);
    }

}