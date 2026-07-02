/**
 * The "Creator" in the Factory Method pattern.
 * Declares the factory method that subclasses must implement
 * to produce a specific type of Document.
 */
public abstract class DocumentFactory {

    // The factory method — each concrete factory decides which
    // concrete Document subclass to instantiate.
    public abstract Document createDocument();

    // A template-style helper that uses the factory method
    // without knowing the concrete document type in advance.
    public Document openNewDocument() {
        Document doc = createDocument();
        doc.open();
        return doc;
    }
}
