package creation.factorymethod;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 14:32
 * @describetion :
 */
public class FactoryA implements  FactoryI {
    @Override
    public ProductI creatProduct() {
        return new ProductA();
    }
}
