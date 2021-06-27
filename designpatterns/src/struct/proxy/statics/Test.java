package struct.proxy.statics;

/**
 * @author ： cxyxh
 * @date : 2021/6/20 17:10
 * @describetion : 静态代理模式
 *
 */
public class Test {

    public static void main(String[] args) {
        //张三请律师打官司
        People zhangsan = new People();
        Lawyer lawyer = new Lawyer(zhangsan);
        lawyer.doCourt();
    }
}
