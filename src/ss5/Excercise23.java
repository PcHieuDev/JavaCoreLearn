package ss5;

/*
Tìm các số thoả mãn điều kiện
*/
public class Excercise23 {
    public static void main(String[] args) {


        for (int number = 10; number <= 99; number++) {
            int number1 = number / 10;
            int number2 = number % 10;

            int sum = number1 + number2;
            int product = number1 * number2;

            if (product == 2 * sum) {
                System.out.println(number);
            }
        }

    }
}
