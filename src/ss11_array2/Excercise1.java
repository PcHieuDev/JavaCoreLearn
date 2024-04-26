package ss11_array2;

import java.util.Scanner;
import java.util.Arrays;

/*
Xử lý Mảng 2 chiều
Viết chương trình thực hiện công việc sau:
    a. Nhập/Xuất ma trận A (n dòng, n cột) gồm các phần tử kiểu int.
    b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.
    c. Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A. In X ra.
    d. Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận.
    e. Tìm số lớn nhất trên đường chéo chính của ma trận.
    f. Tìm số nhỏ nhất trên đường chéo phụ của ma trận.
    g. Đếm số lượng số nguyên tố trong ma trận.
    h. Hoán đổi 2 dòng của ma trận
    i. Hoán đổi 2 cột của ma trận
*/
public class Excercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhập vào số dòng và số cột của ma trận: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số dòng và số cột lớn hơn 0.");
            }
        } while (n <= 0);

        // Khai báo ma trận A
        int[][] matrix = new int[n][n];

        // Nhập ma trận A
        inputMatrix(matrix);

        // Xuất ma trận A
        System.out.println("Ma trận A vừa nhập: ");
        outputMatrix(matrix);

        // Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.
        System.out.println("b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.");
        calculateOfMultiplesOf3(matrix);

        // c. Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A. In X ra.
        System.out.println("c. Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A. In X ra." + Arrays.toString(findMaxOfEachRow(matrix)));

        // d. Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận.
        System.out.println("d. Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận." + findMaxInArray(matrix[n - 1]));


        // e. Tìm số lớn nhất trên đường chéo chính của ma trận.
        System.out.println("e. Tìm số lớn nhất trên đường chéo chính của ma trận.");
        findMaxDiagonal(matrix);

        // f. Tìm số nhỏ nhất trên đường chéo phụ của ma trận.
        System.out.println("f. Tìm số nhỏ nhất trên đường chéo phụ của ma trận.");
        findMinDiagonal(matrix);

        // g. Đếm số lượng số nguyên tố trong ma trận.
        System.out.println("g. Đếm số lượng số nguyên tố trong ma trận.");
        countPrimeNumber(matrix);

        // h. Hoán đổi 2 dòng của ma trận
        System.out.println("h. Hoán đổi 2 dòng của ma trận");
        System.out.println("Nhập vào 2 dòng cần hoán đổi: ");
        int row1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        swapRow(matrix, row1, row2);
        System.out.println("Ma trận sau khi hoán đổi 2 dòng: ");
        outputMatrix(matrix);

        // i. Hoán đổi 2 cột của ma trận
        System.out.println("i. Hoán đổi 2 cột của ma trận");
        System.out.println("Nhập vào 2 cột cần hoán đổi: ");
        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();
        swapColumn(matrix, col1, col2);
        System.out.println("Ma trận sau khi hoán đổi 2 cột: ");
        outputMatrix(matrix);


    }

    // a. Nhập ma trận A
    public static void inputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // hien thi thong bao nhap phan tu
                System.out.printf("Nhập phần tử thứ [%d][%d]: ", i, j);

                // Gán giá trị cho phần tử tại vị trí i, j
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    //  Xuất ma trận A
    public static void outputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // In phần tử tại vị trí i, j
                System.out.print(matrix[i][j] + "\t");
            }
            // Xuống dòng sau khi in hết các phần tử trên 1 hàng
            System.out.println();
        }
    }

    // b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.
    public static void calculateOfMultiplesOf3(int[][] matrix) {
        int tich = 1;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] % 3 == 0) {
                // Tính tích các số là bội số của 3
                tich *= matrix[0][j];
            }
        }
        System.out.println("Tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận: " + tich);
    }

    // c. Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A. In X ra.
    static int[] findMaxOfEachRow(int[][] matrix) {
        int[] max = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            max[i] = findMaxInArray(matrix[i]);
        }
        return max;
    }

    static int findMaxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // d. Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận.
    public static void calculateOfMultiplesOf5(int[] array) {
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 5 == 0) {
                // Tính tổng các số là bội số của 5
                sum += array[j];
            }
        }
        System.out.println("Tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận: " + sum);
    }

    // e. Tìm số lớn nhất trên đường chéo chính của ma trận.
    public static void findMaxDiagonal(int[][] matrix) {
        // Giả sử phần tử đầu tiên của ma trận là phần tử lớn nhất
        int max = matrix[0][0];

        // Duyệt qua các phần tử trên đường chéo chính
        for (int i = 1; i < matrix.length; i++) {
            // Nếu phần tử tại vị trí i, i lớn hơn max
            if (matrix[i][i] > max) {
                // Gán max bằng phần tử tại vị trí i, i
                max = matrix[i][i];
            }
        }
        System.out.println("Số lớn nhất trên đường chéo chính của ma trận: " + max);
    }

    // f. Tìm số nhỏ nhất trên đường chéo phụ của ma trận.
    public static void findMinDiagonal(int[][] matrix) {
        // Giả sử phần tử đầu tiên của ma trận là phần tử nhỏ nhất
        int min = matrix[0][matrix.length - 1];

        // Duyệt qua các phần tử trên đường chéo phụ
        for (int i = 1; i < matrix.length; i++) {
            // Nếu phần tử tại vị trí i, n - 1 - i nhỏ hơn min
            if (matrix[i][matrix.length - 1 - i] < min) {
                // Gán min bằng phần tử tại vị trí i, n - 1 - i
                min = matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Số nhỏ nhất trên đường chéo phụ của ma trận: " + min);
    }

    // g. Đếm số lượng số nguyên tố trong ma trận.
    public static void countPrimeNumber(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrimeNumber(matrix[i][j])) {
                    count++;
                }
            }
        }
        System.out.println("Số lượng số nguyên tố trong ma trận: " + count);
    }

    // Kiểm tra số nguyên tố
    public static boolean isPrimeNumber(int n) {
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

    // h. Hoán đổi 2 dòng của ma trận
    public static void swapRow(int[][] matrix, int row1, int row2) {
        for (int j = 0; j < matrix[row1].length; j++) {
            int temp = matrix[row1][j]; // Lưu giá trị của dòng row1
            matrix[row1][j] = matrix[row2][j]; // Gán giá trị của dòng row2 cho dòng row1
            matrix[row2][j] = temp; // Gán giá trị của dòng row1 cho dòng row2
        }
    }

    // i. Hoán đổi 2 cột của ma trận
    public static void swapColumn(int[][] matrix, int col1, int col2) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][col1]; // Lưu giá trị của cột col1
            matrix[i][col1] = matrix[i][col2]; // Gán giá trị của cột col2 cho cột col1
            matrix[i][col2] = temp; // Gán giá trị của cột col1 cho cột col2
        }
    }


}
