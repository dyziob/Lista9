package Zad3;

public class myrun extends Thread {
    private int id;

    public myrun(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 100 == 0) {
                System.out.println(Thread.currentThread().getId() + "\tWątek: " + id + "\t" + Thread.currentThread().getPriority() + "\t" + i);
            }
        }
    }
}