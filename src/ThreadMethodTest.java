/**
 * @author ZhouWu
 * @create 2019-07-20-10:01
 */

/**
 *@ClassName ThreadMethodTest
 *@Description TODO
 *@Version 1.0
 */
public class ThreadMethodTest {
    public static void main(String[] args) {

    }



}

class HeheThread extends Thread {
    public HeheThread(String tname) {
        super(tname);
    }

    @Override
    public void run() { // ①启动当前线程， ②.对应线程类的调用run方法
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}