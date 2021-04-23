package com.company;

import java.util.Scanner;

public class Document {
    private String documentId;
    private String imprint;
    private int amount;
    public static Scanner sc = new Scanner(System.in);
    public Document(){

    }

    public Document(String documentId, String imprint, int amount) {
        this.documentId = documentId;
        this.imprint = imprint;
        this.amount = amount;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getAmount() {
        return amount;
    }

    public void setReleaseNumber(int amount) {
        this.amount = amount;
    }

    public void documentInfo(){
        System.out.println("Mã tài liệu");
        this.documentId = sc.next();
        System.out.println("Tên nhà xuất bản");
        this.imprint = sc.next();
        System.out.println("Số bản phát hành");
        this.amount = sc.nextInt();
    }
    public void displayDocumentInfo(){
        System.out.printf("Mã tài liệu: %s, Tên nhà xuất bản: %s, Số bản phát hành: %d, ",documentId,imprint,amount);
    }

}
