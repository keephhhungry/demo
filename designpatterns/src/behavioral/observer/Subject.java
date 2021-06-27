package behavioral.observer;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:42
 * @describetion :
 */
public interface Subject {

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void add(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void del(Observer observer);

    /**
     * 通知所有的观察者
     */
    public void notifyAllObservers();
}
