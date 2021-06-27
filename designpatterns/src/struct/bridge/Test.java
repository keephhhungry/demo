package struct.bridge;

/**
 * @author ： cxyxh
 * @date : 2021/6/19 12:43
 * @describetion : 桥接模式
 * 此案例的场景如下：
 * 手机的品牌有华为，小米等等；
 * 手机的样式有直立手机，折叠手机等等；
 * 组装起来有小米直立、小米折叠、华为直立、华为折叠
 * 当手机的品牌和手机样式进行增加时，类会出现爆炸。
 * <p>
 * 此时我们引入桥接模式
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
        Phone phone = new FolderPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("==========================");

        phone = new UpRightPhone(new HuaWei());
        phone.open();
        phone.call();
        phone.close();
    }
}
