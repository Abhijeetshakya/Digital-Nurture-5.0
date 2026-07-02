/**
 * Test class to demonstrate creating different document types
 * (Word, PDF, Excel) using the Factory Method Pattern —
 * without the client code ever calling "new WordDocument()" etc. directly.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        // Client only depends on the abstract DocumentFactory / Document types.
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        System.out.println("--- Creating and opening a Word document ---");
        Document wordDoc = wordFactory.openNewDocument();
        wordDoc.save();

        System.out.println("\n--- Creating and opening a PDF document ---");
        Document pdfDoc = pdfFactory.openNewDocument();
        pdfDoc.save();

        System.out.println("\n--- Creating and opening an Excel document ---");
        Document excelDoc = excelFactory.openNewDocument();
        excelDoc.save();

        System.out.println("\nDocument types created: "
                + wordDoc.getClass().getSimpleName() + ", "
                + pdfDoc.getClass().getSimpleName() + ", "
                + excelDoc.getClass().getSimpleName());
    }
}
