package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Book {

    @Value("978-0061120084")
    private String isbn;
    
    @Value("The Alchemist")
    private String title;
    
    @Value("Paulo Coelho")
    private String author;
    
    @Value("HarperOne")
    private String publisher;
    
    @Value("1988")
    private String publicationYear;
    
    @Value("208")
    private String pages;
    
    @Value("Fiction")
    private String genre;
    
    @Value("English")
    private String language;
    
    @Value("Hardcover")
    private String format;
    
    @Value("25.99")
    private String price;

}
