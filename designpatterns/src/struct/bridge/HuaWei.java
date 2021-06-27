package struct.bridge;

/**
 * @author ： cxyxh
 * @date : 2021/6/19 12:37
 * @describetion :
 */
public class HuaWei implements Brand {
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
