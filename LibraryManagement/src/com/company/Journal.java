package com.company;

public class Journal extends Document{
    private String releaseNumber;
    private int monthOfRelease;

    public Journal(){

    }

    public Journal(String releaseNumber, int monthOfRelease) {
        this.releaseNumber = releaseNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public Journal(String documentId, String imprint, int amount, String releaseNumber, int monthOfRelease) {
        super(documentId, imprint, amount);
        this.releaseNumber = releaseNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(String releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public int getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(int monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }
    public void journalInfo(){
        documentInfo();
        System.out.println("Số phát hành");
        this.releaseNumber = sc.next();
        System.out.println("Tháng phát hành");
        this.monthOfRelease = sc.nextInt();
    }
    public void displayJournalInfo(){
        displayDocumentInfo();
        System.out.printf("Số phát hành: %s, Tháng phát hành: %d\n",releaseNumber,monthOfRelease);
    }
}
