package behavioral.visitor;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/21 19:27
 * @describetion : 汽车打印访问者
 */
public class PrintCar implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }
}
