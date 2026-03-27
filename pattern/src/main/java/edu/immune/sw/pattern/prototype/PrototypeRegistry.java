package edu.immune.sw.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry<T extends Prototype<T>> {
    private final Map<String, T> prototypes = new HashMap<>();

    public void register(String key, T prototype) {
        prototypes.put(key, prototype);
    }

    public T create(String key) {
        T prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype registered under key: " + key);
        }
        return prototype.cloneObject();
    }
}
