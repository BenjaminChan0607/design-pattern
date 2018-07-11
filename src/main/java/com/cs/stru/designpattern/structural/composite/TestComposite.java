package com.cs.stru.designpattern.structural.composite;

/**
 * Created by benjaminChan on 2018/7/10 0010 上午 11:07.
 */
public class TestComposite {
    /**
     *  定义：(GoF《设计模式》)：将对象组合成树形结构以表示“部分整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
     *
     *  组合模式使得用户对单个对象和组合对象的使用具有一致性；
     *  组合模式用来表示部分和整体之间的层次结构（类似于树型结构）
     *
     *  组合模式，文件系统
     *
     *  Component : composite/leaf
     * @param args
     */
    public static void main(String[] args) {
/*        IFile root = new Folder("我的电脑");
        root.createFile("C盘");
        root.createFile("D盘");
        root.createFile("E盘");
        IFile D = root.getFile(1);
        D.createFile("project");
        D.createFile("电影");
        IFile project = D.getFile(0);
        project.createFile("test1.java");
        project.createFile("test2.java");
        project.createFile("test3.java");
        IFile movie = D.getFile(1);
        movie.createFile("movie1.avi");
        movie.createFile("movie2.avi");

        *//* 以上为当前文件系统的情况，下面我们尝试删除文件和文件夹 *//*
        display(null, root);
        System.out.println();

        project.delete();
        movie.getFile(1).delete();

        System.out.println();
        display(null, root);*/

        IFile root = new Folder("my computer");
        root.createFile("c");
        root.createFile("d");
        root.createFile("e");

        IFile dFolder = root.getFile(1);
        dFolder.createFile("project");
        dFolder.createFile("movie");

        IFile proFolder = dFolder.getFile(0);
        proFolder.createFile("project 1");
        proFolder.createFile("project 2");

        IFile movieFolder = dFolder.getFile(1);
        movieFolder.createFile("movie 1");
        movieFolder.createFile("movie 2");

        display(null,root);

        System.out.println("-------------------------------------------------------------------");
        proFolder.delete();
        movieFolder.getFile(1).delete();
        System.out.println("-------------------------------------------------------------------");

        display(null,root);
    }

    //递归 打印文件系统
    public static void display(String prefix,IFile iFile){
        if (prefix == null) {
            prefix = "";
        }
        System.out.println(prefix + iFile.getName());
        if(iFile instanceof Folder){
            for (int i = 0; ; i++) {
                try {
                    if (iFile.getFile(i) != null) {
                        display(prefix + "--", iFile.getFile(i));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
}
