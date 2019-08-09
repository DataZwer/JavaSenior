package Compare;/**
 * @author ZhouWu
 * @create 2019-07-31-16:22
 */

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 *@ClassName CompareTest
 *@Description TODO
 *@Version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {

    }


    @Test
    public void test1() {
        Goods[] arr = new Goods[6];

        arr[0] = new Goods("Aa",44.1);
        arr[1] = new Goods("Bb",21.2);
        arr[2] = new Goods("C",13.4);
        arr[3] = new Goods("D",62.1);
        arr[4] = new Goods("Cc",33.1);
        arr[5] = new Goods("Dd",12.1);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2() {
        String[] arr = new String[4];
        arr[0] = "arr";
        arr[1] = "hello";
        arr[2] = "world";
        arr[3] = "hadoop";

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
    }

    @Test
    public void test3() {
        String[] arr = new String[4];
        arr[0] = "arr";
        arr[1] = "hello";
        arr[2] = "world";
        arr[3] = "hadoop";

        // 从大到小
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
    }



}
