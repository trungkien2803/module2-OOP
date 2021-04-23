package com.company;

public class Book extends Document{
    public String author;
    public int numberOfPages;

    public Book(){

    }

    public Book(String author, int numberOfPages) {
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(String documentId, String imprint, int amount, String author, int numberOfPages) {
        super(documentId, imprint, amount);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void bookInfo(){
        documentInfo();
        System.out.println("Tên tác giả");
        this.author = sc.next();
        System.out.println("Số trang");
        this.numberOfPages = sc.nextInt();
    }
    public void displayBookInfo(){
        displayDocumentInfo();
        System.out.printf("Tên tác giả: %s, Số trang: %d\n",author,numberOfPages);
    }
}
