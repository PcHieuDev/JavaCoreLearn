package ss12_arrayList;
// Quản lý thông tin nhân viên sử dụng ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise2 {
    // khoi tao 5 ArrayList

    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<String> gender = new ArrayList<>();
    static ArrayList<Double> salary = new ArrayList<>();
    static ArrayList<Double> pointAverage = new ArrayList<>();
    static int numberStaff = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose;

        do {
            inputStaff();
            numberStaff++;
            System.out.println("Tiep tuc khong ? (Y/N)");
            choose = sc.nextLine();
        } while (choose.equals("Y") || choose.equals("y"));

        // xuat thong tin nhan vien
        System.out.println("Danh sach nhan vien");
        for (int i = 0; i < numberStaff; i++) {
            System.out.println("Nhan vien thu " + (i + 1));
            outputStaff(i);
        }
    }

    // nhap thong tin nhan vien
    static void inputStaff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        name.add(sc.nextLine());

        System.out.println("Nhap tuoi nhan vien: ");
        age.add(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhap gioi tinh nhan vien: ");
        gender.add(sc.nextLine());

        System.out.println("Nhap luong nhan vien: ");
        salary.add(Double.parseDouble(sc.nextLine()));

        System.out.println("Nhap diem trung binh nhan vien: ");
        pointAverage.add(Double.parseDouble(sc.nextLine()));

    }

    // xuat thong tin nhan vien
    static void outputStaff(int i) {
        System.out.println("Ten nhan vien: " + name.get(i));
        System.out.println("Tuoi nhan vien: " + age.get(i));
        System.out.println("Gioi tinh nhan vien: + gender.get(i)");
        System.out.println("Luong nhan vien: " + salary.get(i));
        System.out.println("Diem trung binh nhan vien: " + pointAverage.get(i));
    }
}