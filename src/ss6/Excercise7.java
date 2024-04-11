package ss6;
/*
Nhập và in thông tin của n nhân viên, n <= 5
*/
import java.util.Scanner;

public class Excercise7 {
    // 5 bien de luu thong tin nhan vien thu nhat
    static String hoTen1;
    static int tuoi1;
    static String gioiTinh1;
    static double mucLuong1;
    static double diemTrungBinhTotNghiep1;

    // 5 bien de luu thong tin nhan vien thu hai
    static String hoTen2;
    static int tuoi2;
    static String gioiTinh2;
    static double mucLuong2;
    static double diemTrungBinhTotNghiep2;

    // 5 bien de luu thong tin nhan vien thu ba
    static String hoTen3;
    static int tuoi3;
    static String gioiTinh3;
    static double mucLuong3;
    static double diemTrungBinhTotNghiep3;

    // 5 bien de luu thong tin nhan vien thu tu
    static String hoTen4;
    static int tuoi4;
    static String gioiTinh4;
    static double mucLuong4;
    static double diemTrungBinhTotNghiep4;

    // 5 bien de luu thong tin nhan vien thu nam
    static String hoTen5;
    static int tuoi5;
    static String gioiTinh5;
    static double mucLuong5;
    static double diemTrungBinhTotNghiep5;

    public static

    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số lượng nhân viên: ");
            n = scanner.nextInt();
            if (n < 0 || n > 5) {
                System.out.println("Số lượng nhân viên không hợp lệ. Vui lòng nhập lại!");
            }
        } while (n < 0 || n > 5);

        switch(n) {
            case 1:
                System.out.println("Nhập thông tin nhân viên thứ nhất: ");
                nhapThongTin1();
                System.out.println("Thông tin nhân viên thứ nhất: ");
                xuatThongTin1();
                break;
            case 2:
                System.out.println("Nhập thông tin nhân viên thứ nhất: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên thứ hai: ");
                nhapThongTin2();

                System.out.println("Thông tin nhân viên thứ nhất: ");
                xuatThongTin1();
                System.out.println("Thông tin nhân viên thứ hai: ");
                xuatThongTin2();
                break;
            case 3:
                System.out.println("Nhập thông tin nhân viên thứ nhất: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên thứ hai: ");
                nhapThongTin2();
                System.out.println("Nhập thông tin nhân viên thứ ba: ");
                nhapThongTin3();

                System.out.println("Thông tin nhân viên thứ nhất: ");
                xuatThongTin1();
                System.out.println("Thông tin nhân viên thứ hai: ");
                xuatThongTin2();
                System.out.println("Thông tin nhân viên thứ ba: ");
                xuatThongTin3();
                break;
            case 4:
                System.out.println("Nhập thông tin nhân viên thứ nhất: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên thứ hai: ");
                nhapThongTin2();
                System.out.println("Nhập thông tin nhân viên thứ ba: ");
                nhapThongTin3();
                System.out.println("Nhập thông tin nhân viên thứ tu: ");
                nhapThongTin4();

                System.out.println("Thông tin nhân viên thứ nhất: ");
                xuatThongTin1();
                System.out.println("Thông tin nhân viên thứ hai: ");
                xuatThongTin2();
                System.out.println("Thông tin nhân viên thứ ba: ");
                xuatThongTin3();
                System.out.println("Thông tin nhân viên thứ tu: ");
                xuatThongTin4();
                break;
            case 5:
                System.out.println("Nhập thông tin nhân viên thứ nhất: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên thứ hai: ");
                nhapThongTin2();
                System.out.println("Nhập thông tin nhân viên thứ ba: ");
                nhapThongTin3();
                System.out.println("Nhập thông tin nhân viên thứ tu: ");
                nhapThongTin4();
                System.out.println("Nhập thông tin nhân viên thứ nam: ");
                nhapThongTin5();

                System.out.println("Thông tin nhân viên thứ nhất: ");
                xuatThongTin1();
                System.out.println("Thông tin nhân viên thứ hai: ");
                xuatThongTin2();
                System.out.println("Thông tin nhân viên thứ ba: ");
                xuatThongTin3();
                System.out.println("Thông tin nhân viên thứ tu: ");
                xuatThongTin4();
                System.out.println("Thông tin nhân viên thứ nam: ");
                xuatThongTin5();

        }
    }

    static void nhapThongTin1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoTen1 = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính: ");
        gioiTinh1 = scanner.nextLine();

        System.out.println("Nhập mức lương: ");
        mucLuong1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nhập điểm trung bình tốt nghiệp: ");
        diemTrungBinhTotNghiep1 = Double.parseDouble(scanner.nextLine());
    }

    static void nhapThongTin2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoTen2 = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính: ");
        gioiTinh2 = scanner.nextLine();

        System.out.println("Nhập mức lương: ");
        mucLuong2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập điểm trung bình tốt nghiệp: ");
        diemTrungBinhTotNghiep2 = Double.parseDouble(scanner.nextLine());
    }

    static void nhapThongTin3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoTen3 = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính: ");
        gioiTinh3 = scanner.nextLine();

        System.out.println("Nhập mức lương: ");
        mucLuong3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nhập điểm trung bình tốt nghiệp: ");
        diemTrungBinhTotNghiep3 = Double.parseDouble(scanner.nextLine());
    }

    static void nhapThongTin4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoTen4 = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi4 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính: ");
        gioiTinh4 = scanner.nextLine();

        System.out.println("Nhập mức lương: ");
        mucLuong4 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nhập điểm trung bình tốt nghiệp: ");
        diemTrungBinhTotNghiep4 = Double.parseDouble(scanner.nextLine());
    }

    static void nhapThongTin5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoTen5 = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi5 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính: ");
        gioiTinh5 = scanner.nextLine();

        System.out.println("Nhập mức lương: ");
        mucLuong5 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nhập điểm trung bình tốt nghiệp: ");
        diemTrungBinhTotNghiep5 = Double.parseDouble(scanner.nextLine());
    }

    static void xuatThongTin1() {
        System.out.println("Họ tên: " + hoTen1);
        System.out.println("Tuổi: " + tuoi1);
        System.out.println("Giới tính: " + gioiTinh1);
        System.out.println("Mức lương: " + mucLuong1);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTrungBinhTotNghiep1);
    }

    static void xuatThongTin2() {
        System.out.println("Họ tên: " + hoTen2);
        System.out.println("Tuổi: " + tuoi2);
        System.out.println("Giới tính: " + gioiTinh2);
        System.out.println("Mức lương: " + mucLuong2);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTrungBinhTotNghiep2);
    }

    static void xuatThongTin3() {
        System.out.println("Họ tên: " + hoTen3);
        System.out.println("Tuổi: " + tuoi3);
        System.out.println("Giới tính: " + gioiTinh3);
        System.out.println("Mức lương: " + mucLuong3);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTrungBinhTotNghiep3);
    }

    static void xuatThongTin4() {
        System.out.println("Họ tên: " + hoTen4);
        System.out.println("Tuổi: " + tuoi4);
        System.out.println("Giới tính: " + gioiTinh4);
        System.out.println("Mức lương: " + mucLuong4);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTrungBinhTotNghiep4);
    }

    static void xuatThongTin5() {
        System.out.println("Họ tên: " + hoTen5);
        System.out.println("Tuổi: " + tuoi5);
        System.out.println("Giới tính: " + gioiTinh5);
        System.out.println("Mức lương: " + mucLuong5);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTrungBinhTotNghiep5);
    }


}
