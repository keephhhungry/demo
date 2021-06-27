package behavioral.state;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/20 12:20
 * @describetion :
 */
public class Test {

    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateA();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
        //切换状态
        state = new ConcreteStateB();
        //设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }
}
