package behavioral.observer;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:42
 * @describetion :
 */
public class Observer1 implements  Observer{
    @Override
    public void update() {
        System.out.println("Observer1 receive message");
    }
}
