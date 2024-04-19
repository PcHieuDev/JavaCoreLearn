package ss9_array;

/*Mảng một chiều và các thao tác trên mảng*/

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        // 1. cac thao tac nhap xuat mang
        int n;
        do {
            System.out.println("Nhap so phan tu cua mang:\n ");
            n = new Scanner(System.in).nextInt();
            if (n <= 0) {
                System.out.println("So phan tu cua mang phai lon hon 0. Vui long nhap lai!\n");
            }
        } while (n <= 0);

        // tao mang co n phan tu
        int[] arr = new int[n];

        // nhap mang
        inputArray(arr);

        // xuat mang
        outpuArray(arr);

        // 2.a mang co phai toan so chan hay khong
        System.out.print("2.a Kiem tra mang co phai toan so chan hay khong\n");

        if (isAllEven(arr)) {
            System.out.println("Mang co toan so chan\n");
        } else {
            System.out.println("Mang khong phai toan so chan\n");
        }

        // 2.b mang co phai toan so nguyen to hay khong
        System.out.print("2.b Kiem tra mang co phai toan so nguyen to hay khong\n");
        if (isAllPrime(arr)) {
            System.out.printf("Mang co toan so nguyen to\n");
        } else {
            System.out.printf("Mang khong phai toan so nguyen to\n");
        }

        //2.c mang co phai la mang tang dan hay khong
        System.out.print("2.c Kiem tra mang co phai la mang tang dan hay khong\n");
        if (isAscending(arr)) {
            System.out.printf("Mang la mang tang dan\n");
        } else {
            System.out.printf("Mang khong phai la mang tang dan\n");
        }

        // 3.a dem so luong phan tu le trong mang
        System.out.print("3. Dem so luong phan tu le trong mang\n");
        System.out.printf("So luong phan tu le trong mang la: %d\n", countOdd(arr));

        //3.b tinh tong so duong le trong mang
        System.out.print("3.b Tinh tong so duong le trong mang\n");
        System.out.printf("Tong so duong le trong mang la: %d\n", sumOddPlus(arr));

        //3.c co bao nhieu so chia het cho 4 nhung khong chia het cho 5
        System.out.print("3.c Dem so luong phan tu chia het cho 4 nhung khong chia het cho 5\n");
        System.out.printf("So luong phan tu chia het cho 4 nhung khong chia het cho 5 la: %d\n", countDivisible4Not5(arr));

        //3.d tong so nguyen to trong mang
        System.out.print("3.d Tinh tong so nguyen to trong mang\n");
        System.out.printf("Tong so nguyen to trong mang la: %d\n", sumPrime(arr));

        //4.a vi tri cuoi cung cua phan tu x trong mang
        System.out.print("4.a Tim vi tri cuoi cung cua phan tu x trong mang\n");
        System.out.print("Nhap phan tu x can tim:\n ");
        int x = new Scanner(System.in).nextInt();
        findLastIndex(arr, x);

        //4.b vi tri so nguyen to dau tien trong mang neu co
        System.out.print("4.b Tim vi tri so nguyen to dau tien trong mang\n");
        findFirstPrimeIndex(arr);

        //4.c tim so duong nho nhat trong mang
        System.out.print("4.c Tim so nho nhat trong mang\n");
        System.out.printf("So nho nhat trong mang la: %d\n", findMinPossitive(arr));

        //4.d  Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng.
        System.out.print("4.d Tim vi tri cua phan tu k trong mang\n");
        System.out.print("Nhap phan tu k can tim:\n ");
        int k = new Scanner(System.in).nextInt();
        findK(arr, k);

        //4.e tim so lon nhat trong mang
        System.out.print("4.e Tim so lon nhat trong mang\n");
        System.out.printf("So lon nhat trong mang la: %d\n", findMax(arr));

        //4.e tim so nho nhat trong mang
        System.out.print("4.e Tim so nho nhat trong mang\n");
        System.out.printf("So nho nhat trong mang la: %d\n", findMin(arr));

    }

    // 1.a. nhap mang
    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu arr[%d]: \n", i);
            arr[i] = new Scanner(System.in).nextInt();
        }
    }

    // 1.b xuat mang
    public static void outpuArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }

    // 2.a mang co phai toan so chan hay khong
    public static boolean isAllEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //2.b mang co phai toan so nguyen to hay khong
    public static boolean isAllPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(arr[i])) {
                return false;
            }
        }
        return true;
    }

    // check so nguyen to
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //2. c mang co phai la mang tang dan hay khong
    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // 3.a dem so luong phan tu le trong mang
    public static int countOdd(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //3.b tinh tong so duong le trong mang
    public static int sumOddPlus(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    // 3.c co bao nhieu so chia het cho 4 nhung khong chia het cho 5
    public static int countDivisible4Not5(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 && arr[i] % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    // 3.d tong so nguyen to trong mang
    public static int sumPrime(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

    //4.a vi tri cuoi cung cua phan tu x trong mang
    public static int findLastIndex(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                System.out.printf("Phan tu %d xuat hien cuoi cung tai vi tri %d\n", x, i);
                return i;
            }
        }
        return -1;
    }

    //4.b vi tri so nguyen to dau tien trong mang
    public static int findFirstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.printf("So nguyen to dau tien trong mang la %d tai vi tri %d\n", arr[i], i);
                return i;
            }
        }
        return -1;
    }

    //4.c tim so duong nho nhat trong mang
    public static int findMinPossitive(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //4.d tim vi tri cua phan tu k trong mang, k nhap tu ban phim
    public static int findK(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.printf("Phan tu %d xuat hien tai vi tri %d\n", k, i);
                return i;
            } else {
                System.out.printf("Phan tu %d khong xuat hien trong mang\n", k);
            }
        }
        return -1;
    }

    //4. e tim gia tri nho nhat trong mang
    public static int findMin(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 4.e tim gia tri lon nhat trong mang
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
