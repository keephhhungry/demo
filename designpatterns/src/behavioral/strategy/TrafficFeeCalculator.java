package behavioral.strategy;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 21:39
 * @describetion :
 */
public class TrafficFeeCalculator {
    public int goToTianJinEye(CalculateStrategy strategy, int distance) {
        return strategy.calculateTrafficFee(distance);
    }
}
