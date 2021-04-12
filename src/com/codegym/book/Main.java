package com.codegym.book;

import com.codegym.abstract1.FictionBook;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgramingBook("001", "Java", 5000, "Quan", "Java", "Spring");
        books[1] = new ProgramingBook("002", "Java1", 50500, "Quan", "Java", "Spring");
        books[2] = new ProgramingBook("003", "Java2", 554000, "Quan", "Java", "Spring");
        books[3] = new ProgramingBook("004", "PHP", 5000, "Quan", "PHP", "Laravel");
        books[4] = new ProgramingBook("005", "PHP2", 5000, "Quan", "PHP", "Laravel");
        books[5] = new FictionBook("006", "ABC", 15000, "Quan", "Khoa hoc");
        books[6] = new FictionBook("007", "D", 15021200, "Quan", "Khoa hoc1");
        books[7] = new FictionBook("008", "ABCE", 152000, "Quan", "Khoa hoc2");
        books[8] = new FictionBook("009", "ABCF", 151000, "Quan", "Khoa hoc");
        books[9] = new FictionBook("010", "ABCG", 145000, "Quan", "Khoa hoc");
        int sum = 0;
        //Tính tổng tiên 10 cuốn sách:
        for (Book book : books) {
            sum += book.getPrice();
        }
        int count = 0;
        //Đếm sổ sách programing có language là Java
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgramingBook) {
                if (((ProgramingBook) books[i]).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("Số lượng sách Java:"+count);
    }
}
