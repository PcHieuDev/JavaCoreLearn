package ss3;

import java.time.Year;
import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nam sinh cua ban: ");
        int namsinh = scanner.nextInt();
        int namhientai = Year.now().getValue();
        int tuoi = namhientai - namsinh;
        System.out.println("Tuoi cua ban la: " + tuoi);

    }
}
