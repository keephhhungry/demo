package struct.proxy.statics;

/**
 * @author ： cxyxh
 * @date : 2021/6/20 17:09
 * @describetion : 公民类
 */
public class People implements Court {

    @Override
    public void doCourt() {
        System.out.println("公民为自己辩解");
    }
}
