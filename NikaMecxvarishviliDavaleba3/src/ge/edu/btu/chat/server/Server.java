package ge.edu.btu.chat.server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9191);
        System.out.println("სერვერი ჩაირთო და მზადაა კლიენტების მისაღებად...");
        while (true){
            Socket currentSocket = serverSocket.accept();
            System.out.println("მიღებულია ახალი კლიენტი");
            WorkerThread thread = new WorkerThread(currentSocket);
            thread.start();
        }
    }
}