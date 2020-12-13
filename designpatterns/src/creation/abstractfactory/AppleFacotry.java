package creation.abstractfactory;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 17:36
 * @describetion :
 */
public class AppleFacotry implements Factory {
    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
