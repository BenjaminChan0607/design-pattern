package com.cs.stru.designpattern.structural.composite;

/**
 * Created by benjaminChan on 2018/7/10 0010 上午 11:22.
 */
public class File implements IFile {

    private String name;
    private IFile folder;

    public File(String name, IFile folder) {
        this.name = name;
        this.folder = folder;
    }

    public void delete() {
        folder.deleteFile(name);
    }

    public String getName() {
        return name;
    }

    public void createFile(String name) {
        throw new UnsupportedOperationException();
    }

    public void deleteFile(String name) {
        throw new UnsupportedOperationException();
    }

    public IFile getFile(int index) {
        throw new UnsupportedOperationException();
    }
}
