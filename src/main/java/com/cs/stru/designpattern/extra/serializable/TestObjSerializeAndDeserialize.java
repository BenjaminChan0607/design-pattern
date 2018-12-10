package com.cs.stru.designpattern.extra.serializable;

import java.io.*;
import java.text.MessageFormat;

/**
 * @author benjaminChan
 * @date 2018/8/28 0028 下午 2:47
 * <p>
 * 序列化两种作用：1)将对象的字节序列持久化到硬盘，可以避免内存开销过大（比如保存在内存中的Session对象信息）；2)在PRC多个进程之间传输字节序列
 */
public class TestObjSerializeAndDeserialize {

    private static final String FILE_PATH = "c:/person.txt";

    public static void main(String[] args) throws Exception {
        SerializePerson();//序列化Person对象
        Person p = DeserializePerson();//反序列Perons对象
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
                p.getName(), p.getAge(), p.getSex()));
    }

    /**
     * MethodName: SerializePerson
     * Description: 序列化Person对象
     *
     * @throws FileNotFoundException
     * @throws IOException
     * @author xudp
     */
    private static void SerializePerson() throws FileNotFoundException,
            IOException {
        Person person = new Person();
        person.setName("gacl");
        person.setAge(25);
        person.setSex("男");
        // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File(FILE_PATH)));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }

    /**
     * MethodName: DeserializePerson
     * Description: 反序列Perons对象
     *
     * @return
     * @throws Exception
     * @throws IOException
     * @author xudp
     */
    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File(FILE_PATH)));
        Person person = (Person) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }
}
