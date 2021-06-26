package reflection;

/**
 * @author ： cxyxh
 * @date : 2021/4/29 23:41
 * @describetion : 该类仅作为Reflection类的辅助类
 */
public class ReflectionTest {

    private int id;

    private String name;

    private int age;

    public ReflectionTest() {
    }

    public ReflectionTest(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ReflectionTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
