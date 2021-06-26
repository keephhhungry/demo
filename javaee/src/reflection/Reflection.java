package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ： cxyxh
 * @date : 2021/4/29 23:40
 * @describetion : 该类写了反射的三种实现方式
 *  1.通过Class.forName("完全限定名")方法获取类
 *  2.通过类.class方式获取类
 *  3.通过对象.getClass()方法获取类
 */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        method1();
        method2();
        method3();
    }

    /**
     * 通过Class.forName("完全限定名")方法获取类
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void method1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("reflection.ReflectionTest");
        Constructor<?> constructor = clazz.getConstructor();
        ReflectionTest obj = (ReflectionTest) constructor.newInstance();
        obj.setId(1);
        obj.setAge(5);
        obj.setName("Test1");
        System.out.println(obj.toString());
    }

    /**
     * 通过类.class方式获取类
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void method2() throws  NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz =  ReflectionTest.class;
        Constructor<?> constructor = clazz.getConstructor();
        ReflectionTest obj = (ReflectionTest) constructor.newInstance();
        obj.setId(1);
        obj.setAge(5);
        obj.setName("Test2");
        System.out.println(obj.toString());
    }

    /**
     * 通过对象.getClass()方法获取类
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void method3() throws  NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ReflectionTest reflectionTest = new ReflectionTest();
        Class<?> clazz = reflectionTest.getClass();
        Constructor<?> constructor = clazz.getConstructor();
        ReflectionTest obj = (ReflectionTest) constructor.newInstance();
        obj.setId(1);
        obj.setAge(5);
        obj.setName("Test3");
        System.out.println(obj.toString());
    }
}
