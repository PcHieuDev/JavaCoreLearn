package ss7_debugtring;
/*
Cho 2 chuỗi (String) a và b nhập vào từ bàn phím. Hãy so sánh chuỗi nào lớn hơn. (quan trọng)
*/
import java.util.Scanner;



public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi a: ");
        String a = scanner.nextLine();
        System.out.println("Nhap chuoi b: ");
        String b = scanner.nextLine();

        if( a.compareTo(b) > 0){
            System.out.println("Chuoi a lon hon chuoi b");
        } else if (a.compareTo(b) < 0) {
            System.out.println("Chuoi a nho hon chuoi b");
        } else {
            System.out.println("Chuoi a bang chuoi b");

        }
    }
}
