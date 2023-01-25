package Zad2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class OcenyRunnable implements Runnable {
    public void run() {
        Main.runnableId = Thread.currentThread().getId();
        try {
            Random random = new Random();
            File file = new File("Zapis.log");
            if (Main.written == false) {
                file.delete();
            }
            FileWriter writter = new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                writter.write("Id wątku: " + Thread.currentThread().getId() + "\tID Filmu: \t" + (random.nextInt(10000) + 1)
                        + "\tID Użytkownika: \t" + (random.nextInt(10000) + 1) + "\tOcena \t" + (random.nextInt(10) + 1) + "\n");
            }
            writter.close();
            Main.written = true;
        } catch (IOException e) {
        }
    }
}
