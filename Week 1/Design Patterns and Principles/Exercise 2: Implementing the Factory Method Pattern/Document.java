/**
 * Exercise 2: Implementing the Factory Method Pattern
 *
 * Common interface implemented by every document type
 * the document management system can produce.
 */
public interface Document {
    void open();
    void save();
}
