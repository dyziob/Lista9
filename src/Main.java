public class Main {
    public static void main(String[] args) {
        Thread[] thread = new Thread[15];
        for (int i = 0; i < 15; i++) {
            thread[i] = new myrun(i + 1);
            thread[i].start();
        }
    }
}
