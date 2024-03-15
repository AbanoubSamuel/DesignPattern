package org.abg.creational.factory;

public class ResumeFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new Resume();
    }
}
