package com.codegym.abstract1;

public class AbstractDemo {
    public static void main(String[] args) {
        Storage fileStorage = new FileStorage();
        Storage dbStorage = new DBStorage();
        fileStorage.storage();
        dbStorage.storage();
        fileStorage.show();
        ((FileStorage) fileStorage).write();

        Storage storage = new Storage() {
            @Override
            public void message() {
                System.out.println("Xin chào");
            }

            @Override
            public void storage() {
                System.out.println("Có thể lưu dữ liệu");
            }
        };
        Writeable writeable = new Writeable() {
            @Override
            public void write() {
                System.out.println("Viết ...");
            }
        };
        storage.storage();
        writeable.write();
    }
}
