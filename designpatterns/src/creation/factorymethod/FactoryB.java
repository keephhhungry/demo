package creation.factorymethod;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 14:32
 * @describetion :
 */
public class FactoryB implements FactoryI {
    @Override
    public ProductI creatProduct() {
        return new ProductB();
    }
}
