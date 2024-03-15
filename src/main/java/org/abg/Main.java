package org.abg;

import org.abg.creational.factory.CoverLetterFactory;
import org.abg.creational.factory.Document;
import org.abg.creational.factory.DocumentFactory;
import org.abg.creational.factory.ResumeFactory;

public class Main {
    public static void main(String[] args) {
        // Client code using the Factory Method
        DocumentFactory resumeFactory = new ResumeFactory();
        Document resume = resumeFactory.createDocument();
        resume.generate();

        DocumentFactory coverLetterFactory = new CoverLetterFactory();
        Document coverLetter = coverLetterFactory.createDocument();
        coverLetter.generate();
    }
}