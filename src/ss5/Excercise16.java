package ss5;

import java.util.Scanner;

/*
In các hình tam giác bằng dấu sao *
*/

public class Excercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        int length = scanner.nextInt();

        // Hinh a
        System.out.println("Hinh a");
        for (int i = 1; i <= length; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Hinh b
        System.out.println("Hinh b");
        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= length - i + 1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Hinh c
        System.out.println("Hinh c");

    }
}
