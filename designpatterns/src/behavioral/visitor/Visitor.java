package behavioral.visitor;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/21 19:25
 * @describetion : 访问者接口
 */
public interface Visitor {

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);
}
