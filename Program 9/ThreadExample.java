public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("CHETHANA.C(1BM23CS077)");
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        System.out.println("BMS College of Engineering");
                        Thread.sleep(10000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        System.out.println("CSE");
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
