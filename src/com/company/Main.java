package com.company;
import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String host = "netology.homework";
        int port = 8000;

        try (Socket clientSocket = new Socket(host, port);

             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                 out.println("GET / HTTP/1.1\n" + "Host: netology.homework\n\n\n");
                 String resp = in.readLine();
                 System.out.println(resp);
                 out.flush();

                 InputStreamReader in2 = new InputStreamReader(clientSocket.getInputStream());
                 BufferedReader bf2 = new BufferedReader(in2);
                 String str2 = bf2.readLine();
                 System.out.println(("Сервер: " + str2));

                 PrintWriter pr = new PrintWriter(clientSocket.getOutputStream(),true);
                 pr.println("Алексей");
                 pr.flush();

                 InputStreamReader in3 = new InputStreamReader(clientSocket.getInputStream());
                 BufferedReader bf3 = new BufferedReader(in3);
                 String str3 = bf3.readLine();
                 System.out.println(("Сервер: " + str3));

                 PrintWriter pr4 = new PrintWriter(clientSocket.getOutputStream());
                 pr4.println("нет");
                 pr4.flush();

                 InputStreamReader in4 = new InputStreamReader(clientSocket.getInputStream());
                 BufferedReader bf4 = new BufferedReader(in4);
                 String str4 = bf4.readLine();
                 System.out.println("Сервер:" + str4);
             }
    }
}
