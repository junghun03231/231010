package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSaying {
    private long id;
    private String author;
    private String content;

    WiseSaying(long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }
    public String getAuthor() {
        return this.author;
    }
    public  String getContent() {
        return this.content;
    }

}
