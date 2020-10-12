package com.bupt.zhushi.jbdc;

import com.bupt.zhushi.jbdc.entity.Book;
import com.bupt.zhushi.jbdc.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId(2);
        book.setUserName("Jerry");
        book.setUserStatus("heyhey");

        bookService.addBook(book);
    }

    @Test
    public void update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId(1);
        book.setUserName("Jerry");
        book.setUserStatus("heyhey");

        bookService.updateBook(book);
    }

    @Test
    public void delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId(1);

        bookService.deleteBook(book);
    }

    @Test
    public void count(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println(bookService.countBook());
    }

    @Test
    public void findObj(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book tom = bookService.findBook("Tom");
        System.out.println(tom);
    }

    @Test
    public void findAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Book> all = bookService.findAll();
        System.out.println(all);
    }
}