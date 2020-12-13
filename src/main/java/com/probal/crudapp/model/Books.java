package com.probal.crudapp.model;


import javax.persistence.*;

@Entity
@Table
public class Books {

    @Id
    @Column(name = "book_id")
    private int bookId;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_author")
    private String author;
    @Column(name = "book_price")
    private double price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
