//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

import java.io.*;
import java.util.*;
import java.net.*;

public class Main{

    public static void main(String []args) throws IOException {
        URL url = new URL("https://jsonmock.hackerrank.com/api/article_users?page=1");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.addRequestProperty("Content-Type", "application/json");
        InputStream is = connection.getInputStream();


         String s = "ababa";
        // int n = s.length();

         System.out.println(s);
    }
// This code is contributed by Ryuga
}