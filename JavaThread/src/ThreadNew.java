/**
 * @author ZhouWu
 * @create 2019-07-23-13:54
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *@ClassName ThreadNew
 *@Description TODO
 *@Version 1.0
 */
public class ThreadNew {
    public static void main(String[] args) {
        Number2 n2 = new Number2();
        FutureTask futureTask = new FutureTask(n2);
        new Thread(futureTask).start(); // futureTask 实现了Runnable接口

        try {
            Object sum = futureTask.get(); // 自动调用call即回调，得到返回值
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class Number2 implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
