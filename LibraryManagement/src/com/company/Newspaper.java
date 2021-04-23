package com.company;

public class Newspaper extends Document {
    public String releaseDate;

    public Newspaper(){

    }

    public Newspaper(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Newspaper(String documentId, String imprint, int amount, String releaseDate) {
        super(documentId, imprint, amount);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void newspaperInfo(){
        documentInfo();
        System.out.println("Ngày phát hành");
        this.releaseDate = sc.next();
    }
    public void displayNewspaperInfo(){
        displayDocumentInfo();
        System.out.printf("Ngày phát hành: %s\n",releaseDate);
    }
}
