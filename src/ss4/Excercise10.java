package ss4;

import java.util.Scanner;

public class Excercise10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so x: ");
        int x = scanner.nextInt();

        double squareRoot = Math.sqrt(x);

        if(squareRoot % 1 == 0){
            System.out.print(x + " la so chinh phuong");
        } else {
            System.out.print(x + " khong phai la so chinh phuong");
        }


    }
}
