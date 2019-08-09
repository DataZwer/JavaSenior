/**
 * @author ZhouWu
 * @create 2019-08-07-10:39
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *@ClassName ListTest
 *@Description TODO 动态数组测试
 *@Version 1.0
 */
public class ListTest {


    @Test
    public void test() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("hehe");
        list.add(new Person("Hadoop", 10));
        list.add(789);
        List list1 = Arrays.asList(1, 2, 3);
        System.out.println(list.toString());
        list.add(list1);
        System.out.println(list.toString());
    }
}
