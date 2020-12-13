package creation.factorymethod;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 14:29
 * @describetion : 工厂方法模式
 * 1. 有一个产品的接口，接口里面是通用的方法
 * 2. 创建两个产品，实现产品的接口和接口的方法
 * 3. 创建一个工厂的接口，里面有一个生产产品的方法，返回的是产品的接口
 * 4. 创建工厂类，针对不同的产品，写不同的工厂类，实现工厂接口和方法
 * 5. 创建测试类
 */
public class Test {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        ProductI productA = factoryA.creatProduct();
        System.out.println(productA.productName());

        FactoryB factoryB = new FactoryB();
        ProductI productB = factoryB.creatProduct();
        System.out.println(productB.productName());
    }
}
