package com.cs.stru.designpattern.behavior.templatemethod;

/**
 * Created by benjaminChan on 2018/7/16 0016 下午 5:54.
 */
public class TemplateMethodTest {

    /**
     * 模板方法模式用于定义构建某个对象的步骤与顺序，或者定义一个算法的骨架
     * <p>
     * 类加载器与模板方法模式联系紧密
     * JDK类加载器可以大致分为三类，分别是启动类加载器，扩展类加载器，以及应用程序加载器。
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myClassLoader = new MyClassLoader();
//        Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("com.cs.stru.designpattern.behavior.templatemethod.TemplateMethodTest");
        Class<?> clazz = myClassLoader.loadClass("com.cs.stru.designpattern.behavior.templatemethod.TemplateMethodTest");
        Object entity = clazz.newInstance();
        System.out.println(entity instanceof TemplateMethodTest);
    }
}
