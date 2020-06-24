/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahadi.transactions.TransactionDemo.Service;

import com.fahadi.transactions.TransactionDemo.Entities.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fahadi.transactions.TransactionDemo.Repository.ChapterRepository;
import javax.transaction.Transactional;

/**
 *
 * @author developer
 */
@Service
public class ChapterService {
    
    @Autowired
    private ChapterRepository chapterRepository;
    
    @Transactional
    public void saveChapter(Chapter chapter){
        chapterRepository.save(chapter);
    }
    
}
