package ss9_array;

import java.util.Scanner;
/*
Xử lý dữ liệu mảng một chiều để tìm kiếm thông tin nhân viên
*/

public class Excercise3 {
    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
    static String[] gioiTinh = new String[5];
    static double[] mucLuong = new double[5];
    static double[] diemTB = new double[5];
    static int soLuongNhanVien = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chose;

        do {
            // nhap thong tin nhan vien
            inputInfor(soLuongNhanVien);
            soLuongNhanVien++;
            System.out.print("Nhap Yes de tiep tuc, nhap No de dung lai:\n ");
            chose = scanner.nextLine();
        } while (chose.equalsIgnoreCase("yes") || chose.equalsIgnoreCase("y"));

        // xuat thong tin nhan vien
        for (int i = 0; i < soLuongNhanVien; i++) {
            outputInfor(i);
        }
        //     a. Tìm nhân viên có điểm trung bình cao nhất.
        System.out.println("Nhan vien co diem trung binh cao nhat la:\n ");
        findMaxPointAverage();

        //      b. Tìm nhân viên theo họ tên (tìm chính xác).
        System.out.print("Nhap ten nhan vien can tim:\n ");
        String name = scanner.nextLine();
        findName(name);

        //      c. Tìm nhân viên theo họ tên (tìm gần đúng).
        System.out.print("Nhap ten nhan vien can tim:\n ");
        String nameLike = scanner.nextLine();
        findNameLike(nameLike);


    }

    static void inputInfor(int index) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ten nhan vien:\n ");
        hoTen[index] = scanner.nextLine();

        System.out.print("Nhap vao tuoi nhan vien:\n ");
        tuoi[index] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap vao gioi tinh nhan vien:\n ");
        gioiTinh[index] = scanner.nextLine();

        System.out.print("Nhap vao muc luong nhan vien:\n ");
        mucLuong[index] = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap vao diem trung binh nhan vien:\n ");
        diemTB[index] = Double.parseDouble(scanner.nextLine());
    }

    static void outputInfor(int index) {
        System.out.printf("Thong tin nhan vien thu %d\n", index + 1);
        System.out.printf("Ten nhan vien: %s\n", hoTen[index]);
        System.out.printf("Tuoi nhan vien: %d\n", tuoi[index]);
        System.out.printf("Gioi tinh nhan vien: %s\n", gioiTinh[index]);
        System.out.printf("Muc luong nhan vien: %.2f\n", mucLuong[index]);
        System.out.printf("Diem trung binh nhan vien: %.2f\n", diemTB[index]);

    }

    // a. Tìm nhân viên có điểm trung bình cao nhất.
    static void findMaxPointAverage() {
        double maxDiemTB = diemTB[0];
        for (int i = 0; i < soLuongNhanVien; i++) {
            if (diemTB[i] > maxDiemTB) {
                maxDiemTB = diemTB[i];
            }
        }

        for (int i = 0; i < soLuongNhanVien; i++) {
            if (diemTB[i] == maxDiemTB) {
                outputInfor(i);
            }
        }
    }

    // b. Tìm nhân viên theo họ tên (tìm chính xác).
    static void findName(String name) {
        for (int i = 0; i < soLuongNhanVien; i++) {
            if (hoTen[i].equalsIgnoreCase(name)) { // so sanh khong phan biet chu hoa chu thuong
                outputInfor(i);
            }
        }
    }

    // c. Tìm nhân viên theo họ tên (tìm gần đúng).
    static void findNameLike(String name){
        for ( int i = 0; i < soLuongNhanVien; i++){
            if (hoTen[i].contains(name)){
                outputInfor(i);
            }
        }
    }


}
