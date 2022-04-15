package com.kreitek.files;

public abstract class FileSystemItemBase implements FileSystem {
    private static final String PATH_SEPARATOR = "/";
    private String name;
    private Directory directoryParent;
    private String PATH = PATH_SEPARATOR;

    protected FileSystemItemBase(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public FileSystemItemBase getParent() {
        return directoryParent;
    }


    public void setParent(Directory directory) {
        this.directoryParent = directory;
    }

    @Override
    public String getFullPath() {
        if (directoryParent != null) {
            String parentFullPath = directoryParent.getFullPath();
            PATH = directoryParent + (parentFullPath.length() > 1 ? PATH_SEPARATOR : "");
        }
        PATH += getName();
        return PATH;
    }

    @Override
    public abstract int getSize();

}
