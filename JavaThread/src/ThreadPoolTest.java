/**
 * @author ZhouWu
 * @create 2019-07-23-14:39
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@ClassName ThreadPoolTest
 *@Description TODO
 *@Version 1.0
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        // 提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        service.execute(new N1());
        service.execute(new N2());

        service.shutdown();
    }
}

class N1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hehe");
        }
    }
}

class N2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("haha");
        }
    }
}

