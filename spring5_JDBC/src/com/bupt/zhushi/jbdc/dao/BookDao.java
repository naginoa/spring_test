package com.bupt.zhushi.jbdc.dao;

import com.bupt.zhushi.jbdc.entity.Book;

import java.util.List;

public interface BookDao {
    public void add(Book book);

    void update(Book book);

    void delete(Book book);

    int count();

    Book find(String id);

    List<Book> findAll();
}
