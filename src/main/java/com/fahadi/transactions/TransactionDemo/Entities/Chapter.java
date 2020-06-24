/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.transactions.TransactionDemo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author developer
 */
@Entity
@Table(name="TBL_CHAPTER")     
@Getter
@Setter
public class Chapter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String chapterTitle;    
    @Column
    private Integer startPage;
    @Column
    private Integer endPage;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book_id", nullable=false)
    private Book book;
    
    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", chapterTitle='" + chapterTitle + '\'' +
                ", startPage =" + startPage +
                ", endPage =" + endPage +
                ", book_id =" + book.getBook_id() +
                '}';
    }
    
}
