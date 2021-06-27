package struct.decorator;

/**
 * @author ： cxyxh
 * @date : 2021/6/19 22:12
 * @describetion : 装饰者模式
 * 此案例的场景如下：
 * 现在有一个甜品店，甜品店主要卖蛋糕和面包两类
 * 有时候还会在蛋糕和面包中添加水果或者蜡烛作为装饰
 * 这两种情况都会发生，并且后续还有可能增加主营商品和装饰物
 * 希望代码可以方便的算出以上的价格
 * <p>
 * 此时我们引入装饰者模式
 * 将甜品店Sweet定义为一个抽象类，类中添加描述方法并实现，添加抽象的cost方法
 * 定义实际的甜品类型，如蛋糕Cake，面包Bread类，去继承甜品Sweet类，并且重写描述和cost方法
 * 定义抽象的装饰者类Decorator，去继承甜品类，并且写抽象方法desc
 *
 * 将手机的品牌定义为接口，接口里有开机、打电话、关机三类方法，让具体的手机品牌如华为、小米实现手机品牌接口
 * 将手机定义为抽象类，类里面有品牌类作为属性，有构造方法及开机、打电话、关机三类方法，方法的实现实际是调用brand具体的方法
 * 让具体的手机样式，如折叠手机、直立手机去继承手机类并且实现开机、打电话、关机三类方法。
 * <p>
 * 当我们使用的时候，我们new具体的手机样式，参数可以填写具体的手机品牌，使用Phone接口去接收。
 * 这样我们phone抽象类像是充当了桥的作用，实际上调用的还是具体品牌中的各自的方法。
 * 在后期手机的品牌和手机样式增加时，也只是需要去实现接口或者继承抽象类，契合了开闭原则
 */
public class Test {

    public static void main(String[] args) {
        //Cake cake = new Cake();
        //System.out.println(cake.getDescription() + "总共花费" + cake.cost());
        //
        //FruitDecorator fruitDecorator = new FruitDecorator(cake);
        //System.out.println(fruitDecorator.getDescription() + "总共花费" + fruitDecorator.cost());
        //
        //CandleDecorator candleDecorator = new CandleDecorator(fruitDecorator);
        //System.out.println(candleDecorator.getDescription() + "总共花费" + candleDecorator.cost());
    }
}
