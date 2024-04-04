package ss3;

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap diem toan: ");
       double toan = scanner.nextDouble();
        System.out.println("Nhap he so toan: ");
        double hesotoan = scanner.nextDouble();
        System.out.println("Nhap diem ly: ");
        double ly = scanner.nextDouble();
        System.out.println("Nhap he so ly: ");
        double hesoly = scanner.nextDouble();
        System.out.println("Nhap diem hoa: ");
        double hoa = scanner.nextDouble();
        System.out.println("Nhap he so hoa: ");
        double hesohoa = scanner.nextDouble();
        double diemtrungbinh = (toan * hesotoan + ly * hesoly + hoa * hesohoa) / (hesotoan + hesoly + hesohoa);
        System.out.println("Diem trung binh cua ban la: " + diemtrungbinh);



    }
}
