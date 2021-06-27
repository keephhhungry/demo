package struct.adapter;

/**
 * @author ： cxyxh
 * @date : 2021/6/20 14:03
 * @describetion :
 */
public class Adapter extends AC220V implements AC5V  {

    @Override
    public int output5v() {
        int output220v = output220v();
        return output220v/44;
    }
}
