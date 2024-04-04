package ss4;

import java.util.Scanner;

public class ex4 {
    public static void main (String[]  args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a va b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = a > b ? a : b;
        int min = a < b ? a : b;

        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);
    }
}
