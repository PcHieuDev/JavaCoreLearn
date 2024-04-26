package ss12_arrayList;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/*
 Làm việc với ArrayList
*/
// Viết chương trình thực hiện các công việc như sau:
//    a. Nhập một Arraylist tên gọi là a gồm n phần tử kiểu nguyên int.
//    b. In giá trị của các phần tử a.
//    c. Đếm số lượng phần tử lẻ trong arraylist a.
//    d. Tính tổng số dương lẻ của a.
//    e. Nhập vào phần tử k, tìm xem k có xuất hiện trong a không. Nếu có chỉ ra các vị trí của k trong arraylist.
//    f. Sắp sếp a theo thứ tự tăng dần. => Gợi ý: Sử dụng Collection sort để xử lý.
//    g. Đảo ngược thứ tự các phần tử của a. => Gợi ý: Sử dụng Collections reverse để xử lý.
//    h. Xóa các phần tử trong a có giá trị x được nhập vào từ bàn phím.
//    i. Chèn 1 phần tử value vào ví trí index bất kỳ (xóa bớt phần tử cuối cùng).
//    j. Tìm giá trị lớn nhất và nhỏ nhất của a
//    k. Tìm giá trị lớn nhì của a.
public class Excercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // khai báo bien n
        int n;
        do {
            System.out.println("Nhập số phần tử : ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Số phần tử phải lớn hơn 0. Mời nhập lại !");
            }
        } while (n <= 0);

        // khai báo ArrayList
        ArrayList<Integer> a = new ArrayList<>();

        // Nhập giá trị cho ArrayList
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ  %d: ", i + 1);
            a.add(scanner.nextInt());
        }

        // b. In giá trị của các phần tử trong ArrayList
        System.out.println("Các phần tử trong ArrayList: " + a);

        // c. Đếm số lượng phần tử lẻ trong ArrayList
        System.out.println("Số lượng phần tử lẻ trong ArrayList: " + countOdd(a));

        // d. Tính tổng số dương lẻ của a.
        System.out.println("Tổng số dương lẻ của ArrayList: " + sumPositiveOdd(a));

// e. Nhập vào phần tử k, tìm xem k có xuất hiện trong a không. Nếu có chỉ ra các vị trí của k trong arraylist.
        System.out.println("Nhập giá trị cần tìm: ");
        int k = scanner.nextInt();
        ArrayList<Integer> index = findIndex(a, k);
        if (index.size() == 0) {
            System.out.println("Không tìm thấy phần tử " + k + " trong ArrayList.");
        } else {
            System.out.println("Phần tử " + k + " xuất hiện tại các vị trí: " + index);
        }

        // f. Sắp sếp a theo thứ tự tăng dần.
        Collections.sort(a); // sắp xếp tăng dần
        System.out.println("ArrayList sau khi sắp xếp tăng dần: " + a);

        // g. Đảo ngược thứ tự các phần tử của a.
        Collections.reverse(a); // đảo ngược thứ tự
        System.out.println("ArrayList sau khi đảo ngược: " + a);

        //h. Xóa các phần tử trong a có giá trị x được nhập vào từ bàn phím.
        System.out.println("Nhập giá trị cần xóa: ");
        int x = scanner.nextInt();
        a.removeIf(i -> i == x);
        System.out.println("ArrayList sau khi xóa phần tử " + x + ": " + a);

        // i. Chèn 1 phần tử value vào ví trí index bất kỳ (xóa bớt phần tử cuối cùng).
        System.out.println("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int indexInsert = scanner.nextInt();


        // g. Đảo ngược thứ tự các phần tử của a.
        for (int i = 0; i < a.size() / 2; i++) {
            int temp = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, temp);
        }
        System.out.println("ArrayList sau khi đảo ngược: " + a);

        // h. Xóa các phần tử trong a có giá trị x được nhập vào từ bàn phím.
        System.out.print("Nhập giá trị cần xóa: ");
        int y = scanner.nextInt();
        a.removeAll(Arrays.asList(y)); // xóa tất cả phần tử x trong a (nếu có
        System.out.println("ArrayList sau khi xóa phần tử " + y + ": " + a);

        // i. Chèn 1 phần tử value vào ví trí index bất kỳ (xóa bớt phần tử cuối cùng).
        System.out.print("Nhập giá trị cần chèn: ");
        int value2 = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int indexInsert2 = scanner.nextInt();
        a.add(indexInsert2, value2);
        System.out.println("ArrayList sau khi chèn " + value2 + " vào vị trí " + indexInsert2 + ": " + a);

        // j. Tìm giá trị lớn nhất và nhỏ nhất của a
        int max = Collections.max(a);
        int min = Collections.min(a);
        System.out.println("Giá trị lớn nhất trong ArrayList: " + max);
        System.out.println("Giá trị nhỏ nhất trong ArrayList: " + min);

        // k. Tìm giá trị lớn nhì của a.
        // sap xep a theo thu tu giam dan
        a.sort(Collections.reverseOrder());

        // loai bo phan tu dau tien
        a.removeAll(Arrays.asList(a.get(0)));

        // lay phan tu thu 2
        System.out.println("Giá trị lớn thứ 2 trong ArrayList: " + a.get(0));


    }

    // c. Đếm số lượng phần tử lẻ trong ArrayList
    public static int countOdd(ArrayList<Integer> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // d. Tính tổng số dương lẻ của a.
    public static int sumPositiveOdd(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 0 && a.get(i) % 2 != 0) {
                sum += a.get(i);
            }
        }
        return sum;
    }

    // e. Nhập vào phần tử k, tìm xem k có xuất hiện trong a không. Nếu có chỉ ra các vị trí của k trong arraylist.
    public static ArrayList<Integer> findIndex(ArrayList<Integer> a, int k) {
        // khai báo ArrayList index chứa các vị trí của k trong a
        ArrayList<Integer> index = new ArrayList<>();
        // tìm vị trí của k trong a
        for (int i = 0; i < a.size(); i++) {
            // nếu phần tử tại vị trí i bằng k thì thêm i vào index
            if (a.get(i) == k) {
                // thêm i vào index
                index.add(i);
            }
        }
        return index;
    }


}


