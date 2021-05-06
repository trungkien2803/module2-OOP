package com.company;

public class FileDownloader implements Downloader {
    public String userAgent;

    public FileDownloader() {
        this.userAgent = "FireFox";
    }

    @Override
    public void download(String url) {
        System.out.printf("URL: " + url + " userAgent: " + userAgent);

    }
}
