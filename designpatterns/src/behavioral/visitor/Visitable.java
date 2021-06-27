package behavioral.visitor;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/21 19:28
 * @describetion :
 */
public interface Visitable {

    void accept(Visitor visitor);
}
