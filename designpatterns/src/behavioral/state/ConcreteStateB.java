package behavioral.state;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/20 12:19
 * @describetion :
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }

}