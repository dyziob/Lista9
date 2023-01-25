package Zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader extends Thread {
    public void run() {
        File file = new File("Zapis.log");
        int i = 0;
        try {
            Scanner scan = new Scanner(file);
            while (i < 10) {
                System.out.println(Thread.currentThread().getId() + " \t" + scan.nextLine());
                i++;
            }
            scan.close();
        } catch (FileNotFoundException e) {
        }
    }
}
