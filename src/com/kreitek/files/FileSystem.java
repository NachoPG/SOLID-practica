package com.kreitek.files;

public interface FileSystem {
    void open();
    void close();
    void write(byte[] buffer);


}
