package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/21 19:26
 * @describetion :
 */
public class Car {

    private List<Visitable> visit = new ArrayList<>();

    public void addVisit(Visitable visitable) {
        visit.add(visitable);
    }

    public void show(Visitor visitor) {
        for (Visitable visitable : visit) {
            visitable.accept(visitor);
        }
    }
}
