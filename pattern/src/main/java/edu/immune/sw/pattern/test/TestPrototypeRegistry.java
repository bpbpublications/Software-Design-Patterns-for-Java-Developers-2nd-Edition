package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.prototype.Document;
import edu.immune.sw.pattern.prototype.PrototypeRegistry;

public class TestPrototypeRegistry {

    public static void main(String[] args) {
        // Create registry
        PrototypeRegistry<Document> registry = new PrototypeRegistry<>();

        // Register templates
        registry.register("resume", new Document("Resume", "Alex Prime", "Software Engineer", "Apex Systems"));
        registry.register("invoice", new Document("Invoice", "Apex Systems", "CRM License", "Terms"));

        // Create new instances
        Document resume1 = registry.create("resume");
        Document invoice1 = registry.create("invoice");

        // Display cloned docs
        resume1.display();
        invoice1.display();
    }
}