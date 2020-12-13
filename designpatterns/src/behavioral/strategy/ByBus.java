package behavioral.strategy;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 21:36
 * @describetion : 乘坐公交车策略
 */
public class ByBus implements CalculateStrategy {

    @Override
    public int calculateTrafficFee(int distance) {
        return distance < 10 ? 4 : 6;
    }
}
