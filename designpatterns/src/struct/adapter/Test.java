package struct.adapter;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:25
 * @describetion : 适配器模式
 * 此案例的场景如下：
 * 原先有一个输出220V电压的接口，现在有了新的需求，需要兼容输入5V电压的接口。
 * <p>
 * 此时我们引入装适配器模式
 * 定义一个类(AC220V)编写一个方法输出220V电压
 * 定义一个接口(AC5V),编写一个输出5V电压的方法
 * 定义一个适配器类(Adapter),继承AC220V类，实现AC5V方法
 * 实现是为了重写AV5V里面的方法，继承则是可以执行AC220V类中的方法，对接过进行二次兼容处理
 * <p>
 * 当我们使用的时候，我们new适配器类，用实际的AC5V接口去接收它
 * 再去执行输出电压5V的方法
 */
public class Test {

    public static void main(String[] args) {
        AC5V ac5V = new Adapter();
        int output = ac5V.output5v();
        System.out.println("转换后的电压为：" + output + " 伏");
    }
}
