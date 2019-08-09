package String; /**
 * @author ZhouWu
 * @create 2019-07-25-13:18
 */

/**
 *@ClassName String.StringTest
 *@Description TODO
 *@Version 1.0
 */
public class StringTest {
    String str = new String("Good");
    char[] c = {'t', 'e', 's', 't'};

    public String change(String s, char[] ch) {
        s = "hehe!";
        System.out.println("####################");
        System.out.println(s);
        ch[0] = 'b';
        return s;
    }

    public static void main(String[] args) {
        String a = String.valueOf(1);

        StringTest ex = new StringTest();
        String s = ex.change(ex.str, ex.c);
        System.out.println(ex.str);
        System.out.println(ex.c);
        System.out.println(s == ex.str);
    }

}
