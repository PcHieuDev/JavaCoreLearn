package ss7_debugtring;

/*a. Chuyển đổi String thành int
b. Chuyển đổi int thành String
c. Chuyển đổi String thành long
d. Chuyển đổi long thành String
e. Chuyển đổi String thành float
f. Chuyển đổi float thành String
g. Chuyển đổi String thành double
h. Chuyển đổi double thành String
i. Chuyển đổi String thành short
k. Chuyển đổi short thành String*/

public class Excercise2 {
    public static void main(String[] args) {
        // a. Chuyển đổi String thành int
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        // b. Chuyển đổi int thành String
        int num2 = 123;
        String str2 = String.valueOf(num2);
        System.out.println(str2);

        // c. Chuyển đổi String thành long
        String str3 = "123";
        Long num3 = Long.parseLong(str3);
        System.out.println(num3);

        // d. Chuyển đổi long thành String
        Long num4 = 123L;
        String str4 = String.valueOf(num4);
        System.out.println(str4);

        // e. Chuyển đổi String thành float
        String str5 = "123.45";
        float num5 = Float.parseFloat(str5);
        System.out.println(num5);

        // f. Chuyển đổi float thành String
        float num6 = 123.45f;
        String str6 = String.valueOf(num6);
        System.out.println(str6);

        // g. Chuyển đổi String thành double
        String str7 = "123.45";
        double num7 = Double.parseDouble(str7);
        System.out.println(num7);

        // h. Chuyển đổi double thành String
        double num8 = 123.45;
        String str8 = String.valueOf(num8);
        System.out.println(str8);

        // i. Chuyển đổi String thành short
        String str9 = "123";
        short num9 = Short.parseShort(str9);
        System.out.println(num9);

        // k. Chuyển đổi short thành String
        short num10 = 123;
        String str10 = String.valueOf(num10);
        System.out.println(str10);



    }
}
