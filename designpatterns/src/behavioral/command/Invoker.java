package behavioral.command;

/**
 * @ahthor : cxyxh
 * @date : 2021/1/29 15:32
 * @describetion :
 */
public class Invoker {

    Command command;

    public void action(){
        System.out.println("调用者调用");
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
