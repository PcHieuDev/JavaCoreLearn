package ss6.Excercise1;
/*
a.    Viết phương thức đổi một ký tự hoa sang ký tự thường.
*/
import java.util.Scanner;
public class Excercise1A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự cần chuyển: ");

        char character = scanner.next().charAt(0);
        System.out.println("Ký tự sau khi chuyển: " + changeCharacter(character));
    }

    static char changeCharacter(char character){
        if ( character >= 'A' && character<= 'Z' ){
            character = (char) (character + 32);
        }
        return character;
    }

}
