package com.cs.stru.designpattern.creational.factorymethod;

import java.sql.*;
import java.util.ArrayList;

public class TestFactoryMethod {

    public static void main(String[] args) {
        /**
         * factory method
         */
        Factory factory = new FactoryA();
        Light light = factory.getProduce();
        light.turnOn();
        light.turnOff();

        factory = new FactoryB();
        light = factory.getProduce();
        light.turnOn();
        light.turnOff();
//        try {
//            new TestFactoryMethod().testJdbc();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * factory method
     * <p>
     * Driver                                   Connection
     * com.mysql.jdbc.Driver                    ConnectionImpl
     * jdbc.oracle.Driver
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void testJdbc() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://123.207.149.148:3306/test?useUnicode=true&amp;characterEncoding=utf-8";
        String USER = "root";
        String PASSWORD = "1234";//f7Y9rrHGt4uhTexT
        //1.加载驱动程序
//        Class.forName("com.mysql.jdbc.Driver");
        //2.获得数据库链接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from tb_sz_part");
        //4.处理数据库的返回结果(使用ResultSet类)
        while (rs.next()) {
            System.out.println(rs.getString("id") + " "
                    + rs.getString("name"));
        }
        //关闭资源
        rs.close();
        st.close();
        conn.close();
    }


    /**
     * Iterable                 Iterator
     * ArrayList HashSet        AbstractList.Itr    KeyIterator
     */
    public void testItr() {
        Iterable iterable = new ArrayList();
    }
}
