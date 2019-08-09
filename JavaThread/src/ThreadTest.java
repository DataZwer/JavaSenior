/**
 * @author ZhouWu
 * @create 2019-07-19-11:11
 */

/**
 *@ClassName Test1
 *@Description TODO
 *@Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        // myThread.run(); no
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}


class MyThread extends Thread {
    @Override
    public void run() { // ①启动当前线程， ②.对应线程类的调用run方法
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}


