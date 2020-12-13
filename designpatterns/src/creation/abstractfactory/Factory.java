package creation.abstractfactory;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 17:12
 * @describetion :
 */
public interface Factory {

    public Computer createComputer();

    public Phone createPhone();


    //创建一个小米的工厂，创建一个苹果的工厂
    //产品的接口是手机和电脑
}
