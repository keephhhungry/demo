package behavioral.strategy;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 21:36
 * @describetion :乘坐滴滴策略
 */
public class ByDiDiExpress implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return distance < 3 ? 8 : (8 + (distance - 3) * 3);
    }
}
