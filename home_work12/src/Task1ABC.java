public class Task1ABC {
    static final Object monitor = new Object();
    static volatile int currentName = 1;
    static final int num = 5;

    public static void main(String[] args) {

        new Thread(() -> {
            try {
                for (int i = 0; i < num; i++) {
                    synchronized (monitor) {
                        while (currentName != 1) {
                            monitor.wait();
                        }
                        System.out.print("A");
                        currentName = 2;
                        monitor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < num; i++) {
                    synchronized (monitor) {
                        while (currentName != 2) {
                            monitor.wait();
                        }
                        System.out.print("B");
                        currentName = 3;
                        monitor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < num; i++) {
                    synchronized (monitor) {
                        while (currentName != 3) {
                            monitor.wait();
                        }
                        System.out.print("C ");
                        currentName = 1;
                        monitor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
