package com.kreitek.service;

import com.kreitek.files.FileSystemItemBase;

public class FileManager {

    public static int calculateSize(FileSystemItemBase fileSystemItem) {
        return fileSystemItem.getSize();
    }
}
