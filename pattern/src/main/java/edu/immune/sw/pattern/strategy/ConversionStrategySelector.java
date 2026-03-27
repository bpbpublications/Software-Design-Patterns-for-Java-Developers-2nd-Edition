package edu.immune.sw.pattern.strategy;

import java.util.Map;

public class ConversionStrategySelector {

    public static TextToMapConverter getStrategy(TextFormat textFormat) {
        switch (textFormat) {
            case JSON -> { return new JsonToMapConverter(); }
            case XML -> { return new XmlToMapConverter(); }
            case YAML -> { return new YamlToMapConverter(); }
            default -> throw new IllegalArgumentException("Invalid text format passed as input");
        }
    }
}
