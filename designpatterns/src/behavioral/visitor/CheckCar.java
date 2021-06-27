package behavioral.visitor;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/21 19:28
 * @describetion :
 */
public class CheckCar implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("check engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("check body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("check car");
    }
}
