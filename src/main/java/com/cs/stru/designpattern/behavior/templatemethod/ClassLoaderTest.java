package com.cs.stru.designpattern.behavior.templatemethod;

/**
 * Created by benjaminChan on 2018/7/16 0016 下午 5:54.
 */
public class ClassLoaderTest {

    /**
     * 模板方法模式用于定义构建某个对象的步骤与顺序，或者定义一个算法的骨架
     * <p>
     * 模板方法模式与类加载器关系密切
     * JDK类加载器可以大致分为三类，分别是启动类加载器，扩展类加载器，以及应用程序加载器。
     * 启动类加载器：加载JAVA_HOME/lib下的类
     * 扩展类加载器：加载JAVA_HOME/lib/ext下的类，以及被java.ext.dirs系统变量指定的路径下的
     * 应用类加载器：用户自己的类路径(classpath)，即系统类加载器，也是ClassLoader的父类加载器
     * <p>
     * ClassLoader使用了模板方法模式，其中的主要方法loadClass(String name,boolean resolve) 递归调用方法
     * 第一步，调用findLoadedClass()方法，看是否有已加载好的类；
     * 第二步，看父类加载是否为null，如果不为null，则从父类加载器加载类
     * 第三步，如果父类加载器为null，则从启动类加载器加载
     * 第四步，都失败的话，则从findClass()方法加载
     * <p>
     * 这个步骤即JDK类加载的双亲委派模型，从父类加载器直至到顶层启动类类加载器，都找不到则采用当前的类加载器，其目的是为了保证JVM中类的一致性
     * <p>
     * 类加载器使用模板模式给我们定义好查找的算法，是为了保证我们加载的每一个类在虚拟机当中都有且仅有一个；大部分场景都是如此
     * 当自己定义类加载器的时候会发现JVM中相同全限定名的类可能会有多个；
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myClassLoader = new MyClassLoader();
//        Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("com.cs.stru.designpattern.behavior.templatemethod.ClassLoaderTest");
        Class<?> clazz = myClassLoader.loadClass("com.cs.stru.designpattern.behavior.templatemethod.ClassLoaderTest");
        Object entity = clazz.newInstance();
        System.out.println(entity instanceof ClassLoaderTest);
    }
}