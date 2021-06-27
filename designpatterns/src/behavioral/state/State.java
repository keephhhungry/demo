package behavioral.state;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/20 12:19
 * @describetion :
 */
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
