package behavioral.strategy;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 21:37
 * @describetion : 骑单车策略
 */
public class BySharedBicycle implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return 2;
    }
}
