package String;

/**
 * @author ZhouWu
 * @create 2019-07-27-13:21
 */

import org.junit.Test;

/**
 * @ClassName StringBBTest
 * @Description TODO
 * @Version 1.0
 */
public class StringBBTest {
    public static void main(String[] args) {

    }


    @Test
    public void test1() {


    }


    public String reverse1(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            char[] chars = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++,y--) {
                char tmp = chars[x];
                chars[x] = chars[y];
                chars[y] = tmp;
            }
            return new String(chars);
        }
        return null;
    }

    public String reverse2(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            String reverseStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            reverseStr += str.substring(endIndex+1);
            return reverseStr;
        }
        return null;
    }

    public String reverse3(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0, startIndex));
            for (int i = endIndex; i >= startIndex ; i--) {
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex+1));
            return builder.toString();
        }
        return null;
    }

    public int getCount(String mainStr, String subStr) {
        int mainLen = mainStr.length();
        int subLen = subStr.length();
        int count = 0;
        if (mainLen >= subLen) {
            while (true) {
                int find = mainStr.indexOf(subStr);
                if (find != -1) {
                    count++;
                    mainStr = mainStr.substring(find + subStr.length());
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public int getCount2(String mainStr, String subStr) {
        int mainLen = mainStr.length();
        int subLen = subStr.length();
        int count = 0;
        int index;
        if (mainLen >= subLen) {
            while ((index = mainStr.indexOf(subStr)) != -1) {
                count++;
                mainStr = mainStr.substring(index + subStr.length());
            }
            return count;
        }
        return count;
    }

    public int getCount3(String mainStr, String subStr) {
        int mainLen = mainStr.length();
        int subLen = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLen >= subLen) {
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLen;
            }
        }
        return count;
    }

    @Test
    public void getCountTest() {
        String str1 = "abababa";
        String str2 = "ab";
        System.out.println(getCount3(str1, str2));
    }
}
