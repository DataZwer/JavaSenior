/**
 * @author ZhouWu
 * @create 2019-08-02-22:08
 */

/**
 *@ClassName SeasonTest
 *@Description TODO
 *@Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }

}

class Season {
    // 声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    // 私有化类的构造器

    // 提供当前枚举类的多个public static final对象
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season FALING = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "冬hehe");

    // get
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    // toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

enum  Season1 {
    SUMMER("夏天", "夏日炎炎"),
    FALING("秋天", "秋高气爽"),
    WINTER("冬天", "冬hehe");

    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 提供当前枚举类的多个public static final对象

    // get
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


}