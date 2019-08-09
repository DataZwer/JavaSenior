/**
 * @author ZhouWu
 * @create 2019-08-07-10:28
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 *@ClassName ForTest
 *@Description TODO
 *@Version 1.0
 */
public class ForTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("hehe");
        coll.add(new Date());

        for (Object obj: coll) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        String[] arr = new String[]{"hehe", "haha", "lala"};

        // 方式一
        for (int i = 0; i < arr.length; i++) arr[i] = "lele";
        System.out.println(Arrays.toString(arr)); // 全部改变

        // 方式二
        String[] arr1 = new String[]{"hehe", "haha", "lala"};
        for (String str: arr) {
            str  = "lele"; // 新开的变量，不改变原数组
        }
        System.out.println(Arrays.toString(arr1));


    }




}
