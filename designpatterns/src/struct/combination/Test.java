package struct.combination;

/**
 * @author ： cxyxh
 * @date : 2021/6/20 12:47
 * @describetion : 组合模式
 * 此案例的场景如下：
 * 编写程序展示一个学校院系结构：要在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系
 * 传统方式将学院看做是学校的子类，系是学院的子类，这类方案不能很好的实现管理的操作。
 * <p>
 * 此时我们引入组合模式
 * 设置一个组织抽象类(OrganizationComponent)，定义通用的属性和方法
 * 设置大学(University)、学院(College)以及系类(Department)重写方法
 * <p>
 * 当我们使用的时候，我们new具体的大学，学院或者系类，使用OrganizationComponent接口去接收。
 * 根据业务需求做相应的操作
 */
public class Test {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "清华大学");

        OrganizationComponent computerCollege = new College("学院1", "学院1");
        OrganizationComponent infoEngineercollege = new College("学院2", "学院2");


        computerCollege.add(new Department("系别1", "系别1"));
        computerCollege.add(new Department("系别2", "系别2"));
        computerCollege.add(new Department("系别3", "系别3"));

        infoEngineercollege.add(new Department("ͨ系别4", "系别4"));
        infoEngineercollege.add(new Department("系别5", "系别5"));

        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.print();
    }

}
