package org.abg.creational.factory;

public class CoverLetterFactory implements DocumentFactory {
    /**
     * @return Document
     */
    @Override
    public Document createDocument() {
        return new CoverLetter();
    }
}
