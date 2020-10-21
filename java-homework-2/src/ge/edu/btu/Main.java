package ge.edu.btu;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.print("შეიყვანეთ საძიებო სიტყვა: ");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        logger.info("შემოტანილი სიტყვა : " + searchName);

        File file = new File("/Users/nika/Desktop/");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().contains(searchName.toLowerCase());
            }
        });

        for (File item : files) {
            logger.info("მოიძებნა: " + item.getName());
        }

    }
}
