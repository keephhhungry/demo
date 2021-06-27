package behavioral.visitor;

import java.util.HashMap;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/21 19:37
 * @describetion :
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.addVisit(new Body());
        car.addVisit(new Engine());

        PrintCar printCar = new PrintCar();
        car.show(printCar);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    }
}
