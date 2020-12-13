package behavioral.templatemethod;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 22:09
 * @describetion : 模板方法模式
 *
 * 优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
 *
 * 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 */
public class Test {
    public static void main(String[] args) {
        Game game1 = new Basketball();
        game1.play();
        Game game2 = new Football();
        game2.play();
    }
}
