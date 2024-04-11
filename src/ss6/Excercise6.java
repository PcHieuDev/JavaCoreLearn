import java.util.Scanner;
/*
Nhập và in thông tin của một nhân viên
*/

public class Excercise6 {
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double mucLuong;
    static double diemTrungBinhTotNghiep;

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }

    static void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();

        System.out.println("Nhập mức lương: ");
        mucLuong = scanner.nextDouble();

        System.out.println("Nhập điểm trung bình tốt nghiệp: ");
        diemTrungBinhTotNghiep = scanner.nextDouble();
    }

    static void xuatThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Mức lương: " + mucLuong);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTrungBinhTotNghiep);
    }
}
