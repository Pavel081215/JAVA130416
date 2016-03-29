package golovachCourses;

//import com.sun.deploy.net.HttpUtils;

import golovachCourses.HttpUtils;
import sun.nio.cs.US_ASCII;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Date;

public class Server10 {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true) {
            System.out.println("Wait for TCP connection.");
            Socket socket = serverSocket.accept(); //hang on in method (операция блокирующая)
            System.out.println("Get 1 connection.");
            try (InputStream in = socket.getInputStream();
                 OutputStream out = socket.getOutputStream()) {

                //read request
                byte[] request = HttpUtils.readRequestFully(in);


                System.out.println("------------------------");
                System.out.print(new String(request));
                System.out.println("------------------------");

                String info ="ПРивет мир";
                byte[] result = info.getBytes();
                //write response
            //    byte[] response =  result;       //new Date().toString().getBytes(); //convert in case to put to byte[]
                out.write(result);
            }finally {
               socket.close();
            }
            //socket.close();
        }
    }

}
//на каждый болкирующий вызов нужен поток