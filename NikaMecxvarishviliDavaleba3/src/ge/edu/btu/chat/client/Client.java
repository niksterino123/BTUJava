package ge.edu.btu.chat.client;


import ge.edu.btu.chat.TextToSend;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 9191);
        System.out.println("კლიენტი შექმნილია და მიმდინარეობს კავშირის დამყარება...");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

        while (true){
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            TextToSend text = new TextToSend(line);
            objectOutputStream.writeObject(text);
            TextToSend answer = (TextToSend) objectInputStream.readObject();
            System.out.println(answer.getText());
            if (answer.getText().contains("ნახვამდის")){
                break;
            }
        }

        objectOutputStream.close();
        objectInputStream.close();
        socket.close();
    }
}
