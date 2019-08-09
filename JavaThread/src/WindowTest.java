/**
 * @author ZhouWu
 * @create 2019-07-21-9:20
 */

/**
 *@ClassName WindowTest
 *@Description TODO
 *@Version 1.0
 */

class Window1 implements Runnable {
    private int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "买票， 票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window1 window1 = new Window1();

        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);

        t1.setName("窗口1");
        t2.setName("窗口2");


        t1.start();
        t2.start();
    }

}
