package ss10_array;
/*
Thao Tác với Mảng 1 Chiều trong Java: Thêm, Xóa, Sửa và Số Nguyên Tố
*/

import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap vao n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("n phai lon hon 0. Vui long nhap lai!");
            }
        } while (n <= 0);

        // tao mang co n phan tu
        int arr[] = new int[n];

        // nhap mang
        inputArray(arr);

        // xuat mang
        System.out.printf("Mang vua nhap la: ");
        outputArray(arr);

        //a. sua cac so nguyen to trong mang thanh so 0
        System.out.printf("\nMang sau khi sua la: ");
        fixPrimeArray(arr);
        outputArray(arr);


        // b. Chèn số 0 đằng sau các số nguyên tố trong mảng
        System.out.printf("\nMang sau khi chen so 0 la: ");
        arr = insertZero(arr);
        outputArray(arr);

        // c. Xóa các phần tử trong mảng có giá trị k
//        System.out.print("\nNhap vao gia tri can xoa: ");
//        int k = scanner.nextInt();
//        arr = removeElement(arr, k);
//        System.out.printf("Mang sau khi xoa la: " + Arrays.toString(arr));


        // d. xoa tat ca so nguyen to trong mang\
        System.out.printf("\nMang sau khi xoa so nguyen to la: ");
        arr = removePrime(arr);
        outputArray(arr);

        //  e. Chèn 1 phần tử vào vị trí k bất kỳ( xoa bot phan tu cuoi cung)
//        System.out.print("\nNhap vao vi tri can chen: ");
//        int index = scanner.nextInt();
//        System.out.print("Nhap vao gia tri can chen: ");
//        int value = scanner.nextInt();
//        arr = insertAndDelete(arr, index, value);
//        System.out.printf("Mang sau khi chen la: ");
//        outputArray(arr);

    }

    // nhap mang
    public static void inputArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
    }

    // xuat mang
    public static void outputArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // a sua cac so nguyen to trong mang thanh so 0
    public static void fixPrimeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = 0;
            }
        }
    }

    // kiem tra so nguyen to
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // b. Chèn số 0 đằng sau các số nguyên tố trong mảng
    static int[] insertZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                // chen so 0 vao sau so nguyen to
                arr = add(arr, i + 1, 0);
                // tang i len 1 don vi
                i++;
            }
        }
        return arr;
    }

    static int[] add(int[] arr, int index, int value) {
        // tao mang moi co kich thuoc lon hon mang cu 1 don vi
        int[] newArr = new int[arr.length + 1];
        // sao chep mang cu sang mang moi
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        // dat gia tri can chen vao mang moi
        newArr[index] = value;
        // sao chep phan con lai cua mang cu sang mang moi
        for (int i = index; i < newArr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;

    }

    // c. Xóa các phần tử trong mảng có giá trị k duoc nhap tu ban phim
    static int[] removeElement(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                arr = del(arr, i);
                i--;
            }
        }
        return arr;
    }

    // xoa phan tu tai vi tri index
    static int[] del(int[] arr, int index) {
        // tao mang moi co kich thuoc nho hon mang cu 1 don vi
        int[] newArr = new int[arr.length - 1];
        // sao chep phan tu tu mang cu sang mang moi
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    // d. xoa tat ca so nguyen to trong mang
    static int[] removePrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr = del(arr, i);
                i--;
            }
        }
        return arr;
    }

    // e. Chèn 1 phần tử vào vị trí k bất kỳ( xoa bot phan tu cuoi cung)
    static int[] insertAndDelete(int[] arr, int index, int value) {
        // them phan tu vao vi tri index
        arr = add(arr, index, value);

        // xoa phan tu cuoi cung
        arr = del(arr, arr.length - 1);

        return arr;
    }

}
