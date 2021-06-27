package behavioral.visitor;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/21 19:26
 * @describetion :
 */
public class Body implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
