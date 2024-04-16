package ss8_stringbuilder_date;
/*a. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
byte⤍short⤍int⤍long⤍float⤍double
b. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
double⤍float⤍long⤍int⤍short⤍byte
c. Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới:
double⤍float⤍long⤍int⤍short⤍byte
d. Phân biệt ép kiểu tường minh và ép kiểu ngầm định
e. Khi nào cần dùng các ký tự L, F, D… sau các số nguyên, số thực trong Java?
Khi nào thì không cần dùng đến các ký tự này mà Java vẫn tự hiểu được các số thuộc kiểu dữ liệu gì?*/

public class Excercise3 {
    public static void main(String[] args) {
        // a. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        // b. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        double g = 10.5;
        float h = (float) g;
        long i = (long) h;
        int j = (int) i;
        short k = (short) j;
        byte l = (byte) k;

        // c. Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới:
        double m = 10.5;
        float n = (float) m;
        long o = (long) n;
        int p = (int) o;
        short q = (short) p;
        byte r = (byte) q;


    }
}
