package com.kreitek.service;

import com.kreitek.files.FileSystemItemBase;

public class FileManager {

    public static int calculateSize(FileSystemItemBase fileSystemItem) {
        return fileSystemItem.getSize();
    }

//    public static int calculateSize(List<FileSystemItem> files) {
//        int totalSize = 0;
//
//        for(FileSystemItem item : files) {
//            if (item instanceof File) {
//                totalSize += item.getSize();
//            } else if (item instanceof Directory) {
//                totalSize += calculateSize(item.listFiles());
//            }
//        }
//
//        return totalSize;
//    }

    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}
