package com.cs.stru.designpattern.structural.composite;

/**
 * Created by benjaminChan on 2018/7/10 0010 上午 11:13.
 */
public interface IFile {

    void delete();

    String getName();

    void createFile(String name);

    void deleteFile(String name);

    IFile getFile(int index);

}
