package com.codegym.abstract1;

public class FileStorage extends Storage implements Writeable {
    @Override
    public void storage() {
        System.out.println("Lưu trữ bằng file");
    }

    @Override
    public void message() {
    }

    @Override
    public void write() {
        System.out.println("Có thể lưu vào ổ " + FILE_PATH);
    }
}
