package ge.edu.btu;

import java.io.*;

class CountThread extends Thread{
    private File file = new File("C:\\Users\\DATA\\Desktop\\BTU_DOCUMENT");
    @Override
    public void run() {
        while(true) {
            System.out.println("რაოდენობა: "
                    + file.listFiles().length);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}