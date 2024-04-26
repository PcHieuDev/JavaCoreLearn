package ss12_arrayList;
// Quản lý thông tin nhân viên sử dụng ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;


public class Excercise3 {
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

        // a. tim nhan vien co diem trung binh cao nhat
        System.out.println("Nhan vien co diem trung binh cao nhat: ");
        findMaxPointAverage();

//        //  tim nhan vien co diem trung binh cao thu 2
//        System.out.println("Nhan vien co diem trung binh cao thu 2: ");
//        findSecondMaxPointAverage();

        // b tim nhan vien theo ho ten
        System.out.println("Nhap ten nhan vien can tim: ");
        String targetName = sc.nextLine();
        findStaffByName(targetName);


    }

    // xuat thong tin nhan vien
    static void outputStaff(int i) {
        System.out.println("Ten nhan vien: " + name.get(i));
        System.out.println("Tuoi nhan vien: " + age.get(i));
        System.out.println("Gioi tinh nhan vien: + gender.get(i)");
        System.out.println("Luong nhan vien: " + salary.get(i));
        System.out.println("Diem trung binh nhan vien: " + pointAverage.get(i));
    }

    // a. tim nhan vien co diem trung binh cao nhat
    static void findMaxPointAverage() {
        double max = pointAverage.get(0);
        int index = 0;
        for (int i = 1; i < numberStaff; i++) {
            if (pointAverage.get(i) > max) {
                max = pointAverage.get(i);
                index = i;
            }
        }

        System.out.println("Ten nhan vien co diem trung binh cao nhat: " + name.get(index));
    }

//    // tim nhan vien co diem trung binh cao thu 2
//    static void findSecondMaxPointAverage() {
//        ArrayList<Double> pointAverageCopy = (ArrayList<Double>) pointAverage.clone();
//
//        // sap xep diem trung binh giam dan
//        pointAverageCopy.sort(Collections.reverseOrder());
//        // loai bo diem trung binh cao nhat
//        pointAverageCopy.removeAll(Arrays.asList(pointAverageCopy.get(0)));
//
//        // tim diem trung binh cao thu 2
//        double secondMax = pointAverageCopy.get(0);
//
//        // tim nhan vien co diem trung binh cao thu 2
//        for (int i = 0; i < numberStaff; i++) {
//            if (pointAverage.get(i) == secondMax) {
//                outputStaff(i);
//            }
//        }
//    }

    // b. tim nhan vien theo ho ten
    static void findStaffByName(String targetName) {
        for (int i = 0; i < numberStaff; i++) {
            if (name.get(i).contains(targetName)) {
                outputStaff(i);;
            }
        }
        System.out.println("Khong tim thay nhan vien co ten " + targetName);
    }

    // c sap xep nhan vien theo do tuoi tang dan
    static void sortStaffByAge() {
        for (int i = 0; i < numberStaff - 1; i++) {
            for (int j = i + 1; j < numberStaff; j++) {
                if (age.get(j) < age.get(j)) {
                    // doi tuoi
                    int temp = age.get(i);
                    age.set(i, age.get(j));
                    age.set(j, temp);

                    // doi ho ten
                    String tempName = name.get(i);
                    name.set(i, name.get(j));
                    name.set(j, tempName);

                    // doi gioi tinh
                    String tempGender = gender.get(i);
                    gender.set(i, gender.get(j));
                    gender.set(j, tempGender);

                    // doi luong
                    double tempSalary = salary.get(i);
                    salary.set(i, salary.get(j));
                    salary.set(j, tempSalary);

                    // doi diem trung binh
                    double tempPointAverage = pointAverage.get(i);
                    pointAverage.set(i, pointAverage.get(j));
                    pointAverage.set(j, tempPointAverage);

                }
            }
        }
    }


}