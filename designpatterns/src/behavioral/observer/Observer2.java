package behavioral.observer;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:42
 * @describetion :
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 receive message");
    }
}
