package String;
/**
 * @author ZhouWu
 * @create 2019-07-26-9:44
 */

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringToOtherType {


    @Test
    public void bytesToString() throws UnsupportedEncodingException {

        // 编码 --> 计算机能够理解
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();
        // utf-8
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        // 解码
        String str2 = new String(gbks, "gbk");
        System.out.println(str2);
    }

    @Test
    public void stringToInt() {
        int a = Integer.parseInt("1344");
        String str = String.valueOf(a);
    }
}
