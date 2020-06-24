package com.fahadi.transactions.TransactionDemo;

import com.fahadi.transactions.TransactionDemo.Entities.Book;
import com.fahadi.transactions.TransactionDemo.Entities.Chapter;
import com.fahadi.transactions.TransactionDemo.Service.BookService;
import com.fahadi.transactions.TransactionDemo.Service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionDemoApplication implements CommandLineRunner {
    
    @Autowired
    private BookService bookService;
    
    @Autowired
    private ChapterService chapterService;
    

    public static void main(String[] args) {
        SpringApplication.run(TransactionDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
    }

}
