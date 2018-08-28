package com.cs.stru.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by benjaminChan on 2018/7/10 0010 上午 11:16.
 */
public class Folder implements IFile {

    private String name;
    private IFile folder;
    private List<IFile> files;

    public Folder(String name) {
        this(name, null);
    }

    public Folder(String name, IFile folder) {
        this.name = name;
        this.folder = folder;
        this.files = new ArrayList<IFile>();
    }

    public void delete() {
        List<IFile> copy = new ArrayList<IFile>();
        for (IFile file : copy) {
            file.delete();
        }

        if (folder != null) {
            folder.deleteFile(name);
        }
    }

    public String getName() {
        return name;
    }

    public void createFile(String name) {
        if (name.contains(".")) {
            files.add(new File(name, this));
        } else {
            files.add(new Folder(name, this));
        }
    }

    public void deleteFile(String name) {
        for (IFile file : files) {
            if (file.getName().equals(name)) {
                files.remove(file);
                break;
            }
        }
    }

    public IFile getFile(int index) {
        return files.get(index);
    }
}
