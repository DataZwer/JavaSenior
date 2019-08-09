/**
 * @author ZhouWu
 * @create 2019-07-21-11:12
 */

/**
 *@ClassName ThreadTest2
 *@Description TODO
 *@Version 1.0
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}


class MyThread2 extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            // synchronized (obj) {
            synchronized (MyThread2.class) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票， 票号为：" + ticket);
                    --ticket;
                } else {
                    break;
                }
            }
        }
    }

    public static synchronized void show() { // 相当于MyThread2.class 作为监视器？
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票， 票号为：" + ticket);
                --ticket;
            }
    }
}
