package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.prototype.Document;

public class TestPrototype {

    public static void main1(String[] args) {
        Document resumeTemplate = new Document("Resume", "Alex Prime", "Software Engineer", "Apex Systems");
        Document invoiceTemplate = new Document("Invoice", "Apex Systems", "CRM License", "Terms");

        // Clone using generic method
        Document resumeCopy = resumeTemplate.cloneObject();
        Document invoiceCopy = invoiceTemplate.cloneObject();

        resumeCopy.display();
        System.out.println("\n---\n");
        invoiceCopy.display();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running in Main Thread: " + Thread.currentThread());
        Thread thread = new Thread(() -> System.out.println("Running in OS Thread: " + Thread.currentThread()));
        thread.start();
        for(int i=0; i < 1000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Running in Virtual Thread: " + Thread.currentThread());
            });
            Thread.startVirtualThread(() -> {
                System.out.println("Running in Virtual Thread: " + Thread.currentThread());
            });
        }
        Thread.sleep(10000);
    }
}