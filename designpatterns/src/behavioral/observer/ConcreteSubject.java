package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:42
 * @describetion :
 */
public class ConcreteSubject implements Subject {

    List<Observer> list = new ArrayList<Observer>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    @Override
    public void del(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyAllObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
