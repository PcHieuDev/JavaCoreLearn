package ss8_stringbuilder_date;
/*a. Cho chuỗi "Hello World"
Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.

b. Cho chuỗi "Hello World"
Thay o thành f bằng cách dùng StringBuffer và StringBuilder.

c. Cho chuỗi "Hello" và chuỗi “World”
Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.

d. Đoạn code sau tạo ra bao nhiêu đối tượng và kết quả hiển thị là gì:
String a = "A";
String b = new String("A");
String c = "A";
    b.concat("B").
String d = c.concat("C");
StringBuffer e = new StringBuffer("E");
    e.append("F");
StringBuilder g = new StringBuilder("G");
    g.append("H");
    System.out.println(a + b + c + d + e + g);

e. Viết chương trình phân biệt sự khác nhau giữa so sánh bằng method equals và so
sánh bằng toán tử == khi sử dụng String, StringBuffer và StringBuilder.*/

public class Excercise1 {
    public static void main(String[] args) {
        // a. Cho chuỗi "Hello World"
        // Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.
        String str = "Hello World";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("Lay ra chu World bang StringBuffer: " + stringBuffer.substring(6));
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("Lay ra chu World bang StringBuilder: " + stringBuilder.substring(6));

        // b. Cho chuỗi "Hello World"
        // Thay o thành f bằng cách dùng StringBuffer và StringBuilder.
        System.out.println("Thay o thanh f bang StringBuffer: " + stringBuffer.replace(4, 5, "f"));
        System.out.println("Thay o thanh f bang StringBuilder: " + stringBuilder.replace(4, 5, "f"));

        // c. Cho chuỗi "Hello" và chuỗi “World”
        // Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Noi 2 chuoi bang String: " + str1 + " " + str2);
        StringBuffer stringBuffer1 = new StringBuffer(str1);
        stringBuffer1.append(str2);
        System.out.println("Noi 2 chuoi bang StringBuffer: " + stringBuffer1);
        StringBuilder stringBuilder1 = new StringBuilder(str1);
        stringBuilder1.append(str2);
        System.out.println("Noi 2 chuoi bang StringBuilder: " + stringBuilder1);

        // d. Đoạn code sau tạo ra bao nhiêu đối tượng và kết quả hiển thị là gì:
        String a = "A";
        String b = new String("A");
        String c = "A";
        b.concat("B");
        String d = c.concat("C");
        StringBuffer e = new StringBuffer("E");
        e.append("F");
        StringBuilder g = new StringBuilder("G");
        g.append("H");
        System.out.println(a + b + c + d + e + g);
        // Kết quả hiển thị là: AAACDEFH

        // e. Viết chương trình phân biệt sự khác nhau giữa so sánh bằng method equals và so
        // sánh bằng toán tử == khi sử dụng String, StringBuffer và StringBuilder.


    }
}
