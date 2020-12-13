package creation.builder;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 14:16
 * @describetion : 建造者模式（优化简单版）
 * 通过目标对象的builder去创建目标对象
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Builder("i79900k", "三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUseCount(2)
                .build();
        System.out.println(computer.toString());
    }
}
