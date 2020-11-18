package ge.edu.btu.chat.server;

import ge.edu.btu.chat.TextToSend;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class WorkerThread extends Thread{

    private Socket clientSocket;

    public WorkerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            handleClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleClient() throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());

        while (true){
            TextToSend receivedText = (TextToSend) objectInputStream.readObject();
            String receivedQuestion = receivedText.getText();
            switch (receivedQuestion){
                case "გამარჯობა":
                    objectOutputStream.writeObject(new TextToSend("მოგესალმებით, რით შემიძლია დაგეხმაროთ?"));
                    break;
                case "მაჩვენე კურსი":
                    objectOutputStream.writeObject(new TextToSend("1.25"));
                    break;
                case "მაჩვენე ფილიალები":
                    objectOutputStream.writeObject(new TextToSend("ჭავჭავეაძე, ვაჟა-ფშაველა, გურამიშვილი"));
                    break;
                case "ნახვამდის":
                    objectOutputStream.writeObject(new TextToSend("გმადლობთ რომ დაგვიკავშირდით, ნახვამდის!"));
                    objectInputStream.close();
                    objectOutputStream.close();
                    clientSocket.close();
                    break;
                default:
                    objectOutputStream.writeObject(new TextToSend("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს."));
            }
        }

    }
}