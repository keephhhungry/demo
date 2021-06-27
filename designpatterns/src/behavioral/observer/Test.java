package behavioral.observer;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:42
 * @describetion : 观察者模式
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyAllObservers();
    }
}
