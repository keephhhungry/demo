package creation.staticfactory;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 14:22
 * @describetion :
 */
public class Factory {

    public ProductI create(String productName) {
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
