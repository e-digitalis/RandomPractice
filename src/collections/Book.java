/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author User
 */

//Just to make the other class work (Book refers to project in other IDE re VPP library project)
public class Book {
    
    private String id;
    private String title;
    private String author;
    private String ISBN;
    private String branch;
    private int numberOfPages;

    public Book(String id, String title, String author, String ISBN, String branch, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.branch = branch;
        this.numberOfPages = numberOfPages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
 
    
    
}
    	