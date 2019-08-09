package Compare;
/**
 * @author ZhouWu
 * @create 2019-07-31-16:20
 */

import org.junit.Test;

/**
 *@ClassName Goods
 *@Description TODO
 *@Version 1.0
 */
public class Goods implements Comparable {
    private String name;
    private double price;


    public Goods(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 双重排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods)o;
            if (this.price > goods.price) {
                return 1;
            } else if(this.price < goods.price) {
                return -this.name.compareTo(goods.name);
            } else {
                return 0;
            }
        }
        throw new RuntimeException("hehe, fuck!"); //相当于返回
    }

    @Test
    public void test() {
        String javeVersion = System.getProperty("java version");
        System.out.println("");
    }

}
