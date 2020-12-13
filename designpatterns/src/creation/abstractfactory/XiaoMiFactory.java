package creation.abstractfactory;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 17:36
 * @describetion :
 */
public class XiaoMiFactory implements Factory {
    @Override
    public Computer createComputer() {
        return new XiaoMiComputer();
    }

    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }
}
