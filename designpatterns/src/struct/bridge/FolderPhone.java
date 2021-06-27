package struct.bridge;

/**
 * @author ： cxyxh
 * @date : 2021/6/19 12:41
 * @describetion :
 */
public class FolderPhone extends Phone {

    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("这是折叠手机");
    }


    public void close() {
        super.close();
        System.out.println("这是折叠手机");
    }

    public void call() {
        super.call();
        System.out.println("这是折叠手机");
    }
}
