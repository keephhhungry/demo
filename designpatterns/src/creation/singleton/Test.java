package creation.singleton;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/19 11:02
 * @describetion :
 */
public class Test {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton4 instance1 = Singleton4.INSTANCE;
    }
}
