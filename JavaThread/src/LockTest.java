/**
 * @author ZhouWu
 * @create 2019-07-22-12:13
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 *@ClassName LockTest
 *@Description TODO
 *@Version 1.0
 */
public class LockTest {

    public static void main(String[] args) {
        Window2 window2 = new Window2();

        Thread t1 = new Thread(window2);
        Thread t2 = new Thread(window2);

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}

class Window2 implements Runnable {
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
                // 2.调用lock，相当于获取同步监视器
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "买票， 票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}