package ss10_array;
// Các thao tác xử lý

import java.util.Arrays;
import java.util.Scanner;

public class Excercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // nhap so phan tu cua mang
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

        // a. Tách các số nguyên tố từ mảng a sang mảng b
        System.out.println("\nMang cac so nguyen to: ");
        int[] arrPrime = getPrimeArray(arr);
        outputArray(arrPrime);

        // b. Tách mảng a thành 2 mảng b(chua so nguyen duong) và c(chua cac so con lai)
        System.out.println("\nMang chua so nguyen duong: ");
        int[] arrPlus = spilitArray(arr);

        outputArray(arrPlus);

        System.out.println("\nMang chua so con lai: ");
        int[] arrNotPlus = spilitArray2(arr);
        outputArray(arrNotPlus);

        // c. sap xep giam gian
        System.out.println("\nMang sau khi sap xep giam dan: ");
        sortArray(arr);
        outputArray(arr);

        // d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.
        System.out.println("\nMang sau khi sap xep: ");
        int[] arrTemp = sortArray2(arr);
        outputArray(arrTemp);

        // e. Đảo thứ tự các phần tử của mảng a.
        System.out.println("\nMang sau khi dao nguoc: ");
        reverseArray(arr);
        outputArray(arr);

        // f. kiem tra xem mang co phai la mang doi xung khong
        if (symmetricArray(arr)) {
            System.out.println("\nMang doi xung");
        } else {
            System.out.println("\nMang khong doi xung");
        }

        // g. Đếm số cặp số đối xứng trong mảng
        System.out.println("So cap so doi xung trong mang: " + countSymmetricNumber(arr));

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

    // a Tách các số nguyên tố từ mảng a sang mảng b
    static int[] getPrimeArray(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }

        int[] arrPrime = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arrPrime[index] = arr[i];
                index++;
            }
        }
        return arrPrime;
    }


    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // b. Tách mảng a thành 2 mảng b(chua so nguyen duong) và c(chua cac so con laii
    static int[] spilitArray(int[] arr) {
        int numPlus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                numPlus++;
            }
        }

        int[] arrPlus = new int[numPlus];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrPlus[index] = arr[i];
                index++;
            }
        }
        return arrPlus;


    }

    static int[] spilitArray2(int[] arr) {
        int numNotPlus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                numNotPlus++;
            }
        }

        int[] arrNotPlus = new int[numNotPlus];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arrNotPlus[index] = arr[i];
                index++;
            }
        }
        return arrNotPlus;
    }

    // c. sap xep giam gian
    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.
    static int[] sortArray2(int[] arr) {
        // mang so duong
        int[] arrPlus = spilitArray(arr);
        // sap xep giam dan
        sortArray(arrPlus);
        // mang khong phai so duong
        int[] arrNotPlus = spilitArray2(arr);
        // sap xep tang dan
        sortArray3(arrNotPlus);

        // gop mang
        int[] arrTemp = new int[arr.length];

        // dua mang duong vao mang tam
        for (int i = 0; i < arrPlus.length; i++) {
            arrTemp[i] = arrPlus[i];
        }

        // dua mang khong phai so duong vao mang tam
        for (int i = 0; i < arrNotPlus.length; i++) {
            arrTemp[arrPlus.length + i] = arrNotPlus[i];
        }

        return arrTemp;
    }


    // sap xep tang gian
    static int sortArray3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > 0 && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return 0;
    }

    //     e. Đảo thứ tự các phần tử của mảng a.
    static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // f. kiem tra xem mang co phai la mang doi xung khong
    static boolean symmetricArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // g. Đếm số cặp số đối xứng trong mảng
    static int countSymmetricNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                count++;
            }
        }
        return count;
    }
}
