/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.transactions.TransactionDemo.Repository;

import com.fahadi.transactions.TransactionDemo.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author developer
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
