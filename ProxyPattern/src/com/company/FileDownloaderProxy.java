package com.company;

public class FileDownloaderProxy implements Downloader{
    @Override
    public void download(String url) {
        FileDownloader fileDownloader = new FileDownloader();
        fileDownloader.download(url);
    }
}
