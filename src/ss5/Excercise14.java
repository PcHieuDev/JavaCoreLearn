package ss5;

import java.util.Scanner;

/*
In hình hộp bằng dấu sao *
*/
public class Excercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai ");
        int length = scanner.nextInt();

        for (int i = 1; i <= length; i++) {
            for ( int j = 1; j <= length; j++) {
                if (i == 1 || i == length || j == 1 || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
