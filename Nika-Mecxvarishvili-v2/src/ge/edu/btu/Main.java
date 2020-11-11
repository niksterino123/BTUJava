package ge.edu.btu;

import java.io.*;
import java.util.Scanner;

class Search {
    File file = new File("C:\\Users\\DATA\\Desktop\\BTU_DOCUMENT");

    public void startup(){
        CountThread countThread = new CountThread();
        countThread.start();
        look();
    }

    void look(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String keyword = scanner.nextLine();

            File[] fileList = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().contains(keyword);
                }
            });
            System.out.println("საძიებო სიტყვა: " + keyword);
            for(File currentFile : fileList){
                System.out.println("მოიძებნა: " + currentFile.getName());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        search.startup();
    }
}
