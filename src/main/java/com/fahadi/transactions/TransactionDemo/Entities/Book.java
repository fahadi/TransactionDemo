/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.transactions.TransactionDemo.Entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author developer
 */
@Entity
@Table(name="TBL_BOOK")
@Getter
@Setter
public class Book implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;
    @Column
    private String name;    
    @Column
    private Double price;
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy="book")
    private Set<Chapter> chapter;
    
    
    
    @Override
    public String toString() {
        return "Book{" +
                "id=" + book_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    
    
    
}
