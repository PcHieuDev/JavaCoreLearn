package ss5;

import java.util.Scanner;


/*
In hình hộp bằng dấu sao *
*/

public class Excercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai ");
        int length = scanner.nextInt();

        // Hinh a
        System.out.println("Hinh a");
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == length || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Hinh b
        System.out.println("Hinh b");
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == length || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Hinh c
        System.out.println("Hinh c");
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == length || j == 1 || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
