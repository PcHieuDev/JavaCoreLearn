package ss10_array;

import java.util.Scanner;
/*
Sử dụng mảng một chiều để quản lý thông tin nhân viên Sắp Xếp Thông Tin Nhân Viên Theo Độ Tuổi Tăng Dần

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
            System.out.print("Nhap Yes de tiep tuc, nhap No de dung lai: ");
            chose = scanner.nextLine();
        } while (chose.equalsIgnoreCase("yes") || chose.equalsIgnoreCase("y"));

        // xuat thong tin nhan vien
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.printf("Thong tin nhan vien thu %d\n", i + 1);
            outputInfor(i);
        }

        // sap xep thong tin nhan vien theo tuoi tang dan
        System.out.println("Sap xep thong tin nhan vien theo tuoi tang dan: ");
        sortInforByAge();
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.printf("Thong tin nhan vien thu %d\n", i + 1);
            outputInfor(i);
        }

    }

    // sap xep thong tin nhan vien theo tuoi tang dan
    static void sortInforByAge() {
        for (int i = 0; i < soLuongNhanVien - 1; i++) {
            for (int j = i + 1; j < soLuongNhanVien; j++) {
                if (tuoi[i] > tuoi[j]) {
                    // swap hoTen
                    String temp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = temp;

                    // swap tuoi
                    int temp1 = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = temp1;

                    // swap gioiTinh
                    String temp2 = gioiTinh[i];
                    gioiTinh[i] = gioiTinh[j];
                    gioiTinh[j] = temp2;

                    // swap mucLuong
                    double temp3 = mucLuong[i];
                    mucLuong[i] = mucLuong[j];
                    mucLuong[j] = temp3;

                    // swap diemTB
                    double temp4 = diemTB[i];
                    diemTB[i] = diemTB[j];
                    diemTB[j] = temp4;
                }
            }
        }
    }

    static void inputInfor(int index) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ten nhan vien: ");
        hoTen[index] = scanner.nextLine();

        System.out.print("Nhap vao tuoi nhan vien: ");
        tuoi[index] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap vao gioi tinh nhan vien: ");
        gioiTinh[index] = scanner.nextLine();

        System.out.print("Nhap vao muc luong nhan vien: ");
        mucLuong[index] = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap vao diem trung binh nhan vien: ");
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


}
