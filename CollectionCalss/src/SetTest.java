/**
 * @author ZhouWu
 * @create 2019-08-09-9:04
 */

import org.junit.Test;

import java.util.*;

/**
 *@ClassName SetTest
 *@Description TODO
 *@Version 1.0
 */



public class SetTest {

    @Test
    public void test() {
        Set set = new HashSet();
        set.add(1456);
        set.add("AA");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));  // 需要重写equals方法
        set.add("Bbaaf");
        set.add(new User("Tom", 12));
        set.add(new User("Tom", 12));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test1() {
        Set set = new LinkedHashSet();
        set.add(1456);
        set.add("AA");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));  // 需要重写equals方法
        set.add("Bbaaf");
        set.add(new User("Tom", 12));
        set.add(new User("Tom", 12));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Set set = new TreeSet();
        set.add(new User("Tom", 12));
        set.add(new User("A", 11));
        set.add(new User("Aom", 10));
        set.add(new User("Gom", 9));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3() {

        Comparator com = new Comparator() {
            // 按照年龄从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else  {
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        Set set = new TreeSet(com);
        set.add(new User("Tom", 12));
        set.add(new User("A", 11));
        set.add(new User("Aom", 10));
        set.add(new User("Gom", 9));



        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}