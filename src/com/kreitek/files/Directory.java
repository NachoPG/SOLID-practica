package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItemBase implements DirectorySystem {

    //    private static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";
    private final List<FileSystemItemBase> files;

    public Directory(String name) {
        super(name);
        files = new ArrayList<>();
    }


    public List<FileSystemItemBase> listFiles() {
        return files;
    }

    @Override
    public void addFile(FileSystemItemBase file) {
        if (!listFiles().contains(file)) {
            listFiles().add(file);
            file.setParent(this);
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemItemBase file : listFiles()) {
            totalSize += file.getSize();
        }
        return totalSize;
    }

//    @Override
//    public void open() {
//        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
//    }
//
//    @Override
//    public void setPosition(int numberOfBytesFromBeginning) {
//        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
//    }
//
//    @Override
//    public byte[] read(int numberOfBytesToRead) {
//        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
//    }
//
//    @Override
//    public void write(byte[] buffer) {
//        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
//    }
//
//    public void close() {
//        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
//    }
}
