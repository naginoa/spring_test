package com.bupt.zhushi.jbdc.service;

import com.bupt.zhushi.jbdc.dao.BookDao;
import com.bupt.zhushi.jbdc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao dao;

    public void addBook(Book book){
        dao.add(book);
    }

    public void updateBook(Book book){
        dao.update(book);
    }

    public void deleteBook(Book book){
        dao.delete(book);
    }

    public int countBook(){
        return dao.count();
    }

    public Book findBook(String id){
        return dao.find(id);
    }

    public List<Book> findAll(){
        return dao.findAll();
    }

    public void batchAddBook(List<Object []> args){dao.batchAdd(args);}

    public void batchDeleteBook(List<Object []> args){dao.batchDelete(args);}
}
