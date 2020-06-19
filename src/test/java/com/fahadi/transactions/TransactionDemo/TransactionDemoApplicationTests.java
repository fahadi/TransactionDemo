package com.fahadi.transactions.TransactionDemo;

import com.fahadi.transactions.TransactionDemo.Entities.Book;
import com.fahadi.transactions.TransactionDemo.Repository.BookRepository;
import com.fahadi.transactions.TransactionDemo.Service.BookService;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionDemoApplicationTests {

    @Autowired
    private BookService bookService;
    
    @Autowired
    private BookRepository bookRepo;

    @Test
    public void addBookToDB(){
        Book book = new Book();
        book.setName("Jungle Book");
        book.setPrice(11.00);
        bookService.saveBook(book);
        List<Book> bookList = bookRepo.findAll();
        assertEquals(2,bookList.size());
    }
    
    @Test
    public void returnAllBooks(){
        
        List<Book> bookList = bookRepo.findAll();
        assertEquals(1,bookList.size());
        
    }

}
