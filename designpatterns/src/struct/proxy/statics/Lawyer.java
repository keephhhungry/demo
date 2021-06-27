package struct.proxy.statics;

/**
 * @author ： cxyxh
 * @date : 2021/6/20 17:10
 * @describetion : 律师类
 */
public class Lawyer implements Court {

    //接收需要代理的对象
    Court zhangsan;

    public Lawyer(Court zhangsan) {
        this.zhangsan = zhangsan;
    }

    public Lawyer() {
    }

    //张三请律师进行辩解
    @Override
    public void doCourt() {
        //张三自己先辩解
        zhangsan.doCourt();
        //律师替张三辩解
        System.out.println("经视频证明,并不是当事人偷得东西");
    }
}
