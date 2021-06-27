package behavioral.command;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:33
 * @describetion :
 */
public class ConcreteCommnd implements Command{

    Receiver receiver;

    public ConcreteCommnd(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令执行");
        receiver.doSomething();
    }
}
