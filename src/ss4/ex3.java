package ss4;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so a:  ");
        int a = scanner.nextInt();

        System.out.print("nhap so b:  ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi doi cho: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
