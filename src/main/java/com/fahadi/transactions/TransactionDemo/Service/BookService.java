/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.transactions.TransactionDemo.Service;

import com.fahadi.transactions.TransactionDemo.Entities.Book;
import com.fahadi.transactions.TransactionDemo.Repository.BookRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author developer
 */
@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    
    @Transactional
    public void saveBook(Book book){
        bookRepository.save(book);
    }
    
}
