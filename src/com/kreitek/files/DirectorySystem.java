package com.kreitek.files;

import java.util.List;

public interface DirectorySystem {
    void addFile(FileSystemItemBase file);
    List<FileSystemItemBase> listFiles();
}
