package com.fahadi.transactions.TransactionDemo;

import com.fahadi.transactions.TransactionDemo.Entities.Book;
import com.fahadi.transactions.TransactionDemo.Entities.Chapter;
import com.fahadi.transactions.TransactionDemo.Repository.BookRepository;
import com.fahadi.transactions.TransactionDemo.Repository.ChapterRepository;
import com.fahadi.transactions.TransactionDemo.Service.BookService;
import com.fahadi.transactions.TransactionDemo.Service.ChapterService;
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
    private ChapterService chapterService;
    
    @Autowired
    private BookRepository bookRepo;
    
    @Autowired
    private ChapterRepository chapterRepo;

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
    public void addChapterToBook(){
        Book book = new Book();
        book.setName("Red Robin");
        book.setPrice(12.00);
        bookService.saveBook(book);
        
        Chapter chapter = new Chapter();
        chapter.setChapterTitle("RedRobin Vengence");
        chapter.setStartPage(10);
        chapter.setEndPage(35);
        chapter.setBook(book);
        
        chapterService.saveChapter(chapter);
        
        List<Chapter> chapterList = chapterRepo.findAll();
        
        chapterList.stream().forEach(System.out::println);
        
        assertEquals(book.getBook_id(),chapterList.get(0).getBook().getBook_id());
    }
    
    @Test
    public void returnAllBooks(){
        
        List<Book> bookList = bookRepo.findAll();
        assertEquals(1,bookList.size());
        
    }

}
