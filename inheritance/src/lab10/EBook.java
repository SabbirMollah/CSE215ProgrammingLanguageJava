package lab10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class EBook extends Book {
    private String downloadUrl;
    private int sizeMB;

    public EBook(String downloadUrl, int sizeMB, String isbn, String title, String author, double price) {
        super(isbn, title, author, price);
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }
    public EBook(){}
    public EBook(String downloadUrl, int sizeMB) {
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public int getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(int sizeMB) {
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        return "EBook{" + "downloadUrl=" + downloadUrl + ", sizeMB=" + sizeMB + '}' ;
    }
    
    
}
