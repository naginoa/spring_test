package com.bupt.zhushi.jbdc.dao;

import com.bupt.zhushi.jbdc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getUserId(), book.getUserName(), book.getUserStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
        if (update != 0){
            System.out.println("insert successful");
        }
    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set userName=?,userStatus=? where userId=?";
        Object[] args = {book.getUserName(), book.getUserStatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
        if (update != 0){
            System.out.println("update successful");
        }
    }

    @Override
    public void delete(Book book) {
        String sql = "delete from t_book where userId=?";
        Object[] args = {book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
        if (update != 0){
            System.out.println("delete successful");
        }
    }

    @Override
    public int count() {
        String sql = "select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Book find(String id) {
        String sql = "select * from t_book where userName=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    @Override
    public List<Book> findAll() {
        String sql = "select * from t_book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void batchAdd(List<Object[]> args) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> args) {
        String sql = "delete from t_book where userId=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(ints);
    }
}
