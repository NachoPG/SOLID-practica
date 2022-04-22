package com.kreitek.files;

public abstract class FileSystemItemBase {
    private static final String PATH_SEPARATOR = "/";
    private String name;
    private Directory directoryParent;
    private String PATH = PATH_SEPARATOR;

    protected FileSystemItemBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public FileSystemItemBase getParent() {
        return directoryParent;
    }

    public void setParent(Directory directory) {
        this.directoryParent = directory;
    }

    public String getFullPath() {
        if (directoryParent != null) {
            String parentFullPath = directoryParent.getFullPath();
            PATH = directoryParent.getFullPath() + (parentFullPath.length() > 1 ? PATH_SEPARATOR : "");
        }
        PATH += getName();
        return PATH;
    }

    public abstract int getSize();

}
