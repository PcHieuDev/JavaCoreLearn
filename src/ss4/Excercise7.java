package ss4;

import java.util.Scanner;

public class Excercise7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap tham nien cong tac: ");
        int month = scanner.nextInt();

        double luongcanban = 650000;
        double hesoluong = 0;

        if (month < 12) {
            hesoluong = 1.92;
        } else if ( month < 36){
            hesoluong = 2.34;
        } else if (month < 60) {
            hesoluong = 3;
        } else {
            hesoluong = 4.5;
        }

        double luong = luongcanban * hesoluong;

        System.out.println("Luong cua ban la: " + luong + "$");
    }
}
