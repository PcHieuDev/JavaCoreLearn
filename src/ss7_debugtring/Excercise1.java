package ss7_debugtring;

import java.util.Scanner;

/*Cho chuỗi "Hello World"
a. Lấy ra chữ World
b. Thay o thành f
c. Đếm xem có bao nhiêu chữ l
d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
g. Đảo chuỗi thành dlroW olleH
h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
i. Đổi toàn bộ kí tự của S sang chữ Hoa
k. Đổi toàn bộ kí tự của S sang chữ thường
l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)*/
public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Hello World";

        // a. Lấy ra chữ World
        System.out.println("Lay ra chu World: " + str.substring(6));

        // b. Thay o thành f
        System.out.println("Thay o thanh f: " + str.replace("o", "f"));

        // c. Đếm xem có bao nhiêu chữ l
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }

        }
        System.out.println("So lan xuat hien cua chu l: " + count);

        // d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        int firstIndex = str.indexOf('l');
        int lastIndex = str.lastIndexOf('l');
        System.out.println("Vi tri xuat hien dau tien cua chu l: " + firstIndex + ", vi tri xuat hien cuoi cung cua chu l: " + lastIndex);

        // e. Xóa hết space ở đầu, giữa và cuối chuỗi
        System.out.println(" Xoa het space o dau , giua va cuoi chuoi: " + str.replace(" ", ""));

        // f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
        System.out.println("Xoa het space dau tien va cuoi cung: " + str.trim());

        // g. Đảo chuỗi thành dlroW olleH
        String chuoiDao = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            chuoiDao += str.charAt(i);
        }
        System.out.println("Chuoi dao: " + chuoiDao);

        // h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
        String str1 = "SQC";
        System.out.println("Chuoi moi: " + str1 + " " + str);
        // use concat
        System.out.println("Chuoi moi: " + str1.concat(" " + str));

        // i. Đổi toàn bộ kí tự của S sang chữ Hoa
        System.out.println("Chuoi viet hoa: "+ str1.toUpperCase());

        // k. Đổi toàn bộ kí tự của S sang chữ thường
        System.out.println("Chuoi viet thuong: "+ str1.toLowerCase());

        // l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();

        System.out.println("Nhap m: ");
        int m = scanner.nextInt();

        System.out.println("Chuoi con: "+ str.substring(n, m));
    }
}
