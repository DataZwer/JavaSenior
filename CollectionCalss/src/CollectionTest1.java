/**
 * @author ZhouWu
 * @create 2019-08-03-10:16
 */


import org.junit.Test;

import java.util.*;

/**
 *@ClassName CollectionTest
 *@Description TODO
 *@Version 1.0
 */
public class CollectionTest1 {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("hehe");
        coll.add(new Date());

        System.out.println(coll.size());
        System.out.println(coll);
    }

    @Test
    public void test2() {

        // contains
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("hehe");
        coll.add(new Date());
        Person p = new Person("hehe", 12);
        coll.add(p);

        System.out.println(coll.contains(p));

        // containsall
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.contains(coll1));
    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("hehe");
        coll.add(new Date());

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
