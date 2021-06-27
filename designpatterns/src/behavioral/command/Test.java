package behavioral.command;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:32
 * @describetion :命令模式
 * 1.类介绍
 *      1)Command类：是一个抽象类，类中需要执行的命令进行生命，一般来说要对外公布一个execute方法来执行命令
 *      2)ConcreteCommand类：Command类的实现类，对抽象类中声明的方法进行实现
 *      3)Invoker类：调用者，负责调用命令
 *      4)Receive类：接收者，负责接收命令并且执行命令
 * 2.优点：
 *      1)降低对象之间的耦合度，行的命令可以很容易的加到系统中。
 *      2)可以比较容易的设计一个组合命令
 *      3)调用同一个方法实现不同的功能
 * 3.缺点：
 *
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommnd concreteCommnd = new ConcreteCommnd(receiver);
        //客户端直接执行具体命令
        concreteCommnd.execute();

        System.out.println("----------------");
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommnd);
        invoker.action();
    }
}
