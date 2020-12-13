package creation.abstractfactory;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 17:11
 * @describetion : 抽象工厂模式
 * 1. 有多个产品的接口，接口里面是通用的方法
 * 2. 创建多个产品，不同类型的产品实现不同的接口和接口方法
 * 3. 创建一个工厂接口，里面有生产多个不同类型产品的接口
 * 4. 针对不同的产品，写不同的工厂类，实现工厂接口，实现生产多个产品接口的方法，方法的内容是生产各自的产品
 * 5. 创建测试类
 */
public class Test {
    public static void main(String[] args) {
        AppleFacotry appleFacotry = new AppleFacotry();
        appleFacotry.createComputer().productName();
        appleFacotry.createPhone().productName();

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.createComputer().productName();
        xiaoMiFactory.createPhone().productName();
    }
}
