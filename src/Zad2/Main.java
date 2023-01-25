package Zad2;

public class Main {
    volatile static Boolean written = false;
    volatile static Long threadId, runnableId;

    public static void main(String[] args) {
        OcenyRunnable Or = new OcenyRunnable();
        OcenyThread Ot = new OcenyThread();
        Thread Ort = new Thread(Or);
        Ot.start();
        Ort.start();

        for(int i=0;i<2;i++){
            FileReader reader = new FileReader();
            reader.start();
        }
    }
}
