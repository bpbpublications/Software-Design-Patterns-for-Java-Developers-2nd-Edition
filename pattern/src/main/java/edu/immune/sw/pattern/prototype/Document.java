package edu.immune.sw.pattern.prototype;
public class Document implements Prototype<Document> {
    private String type;
    private String header;
    private String body;
    private String footer;

    public Document(String type, String header, String body, String footer) {
        this.type = type;
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    // Copy constructor
    public Document(Document doc) {
        this.type = doc.type;
        this.header = doc.header;
        this.body = doc.body;
        this.footer = doc.footer;
    }

    @Override
    public Document cloneObject() {
        return new Document(this);
    }

    public void display() {
        System.out.printf("[%s]\nHeader: %s\nBody: %s\nFooter: %s", type, header, body, footer);
    }
}
