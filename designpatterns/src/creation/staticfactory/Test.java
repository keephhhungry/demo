package creation.staticfactory;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 14:20
 * @describetion : 静态工厂模式
 * 1.有一个产品的接口，接口里面是通过的方法
 * 2.创建两个产品，实现产品的接口和接口的方法
 * 3.创建一个工厂类，该类有一个创建产品的方法，根据输入不同的参数，创建不同的产品，返回值是产品的接口
 * 4.创建测试类进行测试
 *
 * 优点：
 * 缺点：
 */
public class Test {

    public static void main(String[] args) {
        Factory factory = new Factory();
        ProductI productA = factory.create("A");
        productA.productName();
        ProductI productB = factory.create("B");
        productB.productName();
    }
}
