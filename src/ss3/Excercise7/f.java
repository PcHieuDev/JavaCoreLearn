package ss3.Excercise7;

public class f {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = ++i + ++j + i++ + j++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }
}
