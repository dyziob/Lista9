package Zad1;

import java.time.LocalDate;

public class myrun extends Thread {
    private int id;

    public myrun(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println(Thread.currentThread().getId() + "\tWątek: " + id + "\t" + LocalDate.now());
        try {
            Thread.sleep(300);

        } catch (InterruptedException e) {
        }
    }
}

