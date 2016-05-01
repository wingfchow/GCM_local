package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyDy6zcUjWYz4xotflQ4LL45wS8IzweCSFA";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bFnr0Hslx3aoF0RDTstSu4IyiVZAw1jBu5eayVWWr3SRZR4c0bYef07wXvkIsuWtWFDjVPTcnMDLIs0DZVDXrh6Cb0fCeaupeQfk04Sj-Kh96tbOkGBzlBaGNy3iYg4-6G7Aiah");

        c.createData("Working!!", "Test message");

        return c;
    }
}

