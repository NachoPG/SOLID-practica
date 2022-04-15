package com.kreitek.files;

public class File extends FileSystemItemBase implements FileSystem {

    private int size = 0;
    private boolean isOpen = false;
    private int position = 0;

    public File(String name) {
        super(name);
    }
//
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void open() {
        isOpen = true;
        // Aquí vendría código que actualizaría también this.size
    }

    @Override
    public void write(byte[] buffer) {
        size += buffer.length;
        position += buffer.length;
    }

    @Override
    public void close() {
        isOpen = false;
    }

}
