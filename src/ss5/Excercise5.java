package ss5;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();

        for ( int i = 2; i <= 2 * n; i += 2){
            System.out.print(i + " ");
        }
    }
}
