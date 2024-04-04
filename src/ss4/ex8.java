package ss4;

import java.util.Scanner;
public class ex8 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap thang va nam: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        int days = 0;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 31;
                break;
        }
        System.out.printf("Thang %d nam %d co %d ngay", month, year, days);
    }
}
