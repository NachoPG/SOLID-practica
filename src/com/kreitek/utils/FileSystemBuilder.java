package com.kreitek.utils;

import com.kreitek.files.Directory;
import com.kreitek.files.DirectorySystem;
import com.kreitek.files.File;
import com.kreitek.files.FileSystem;

public class FileSystemBuilder {

    private final DirectorySystem root;
    private DirectorySystem currentDirectory;

    public static FileSystemBuilder getBuilder() {
        return new FileSystemBuilder();
    }

    public FileSystemBuilder() {
        root = new Directory(null, "");
        currentDirectory = root;
    }

    public FileSystemBuilder addFile(String name, int size) {
        FileSystem file = new File(currentDirectory, name);
        file.open();
        file.write(new byte[size]);
        file.close();
        currentDirectory.addFile(file.getParent());
        return this;
    }

    public FileSystemBuilder addDirectory(String name) {
        FileSystem directory = new Directory(currentDirectory, name);
        currentDirectory.addFile(directory.getParent());
        currentDirectory = directory.getParent();
        return this;
    }

    public FileSystemBuilder upOneDirectory() {
        return this;
    }

    public DirectorySystem build() {
        return root;
    }
}
