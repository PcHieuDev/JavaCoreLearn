package ss4;

import java.util.Scanner;

public class Excercise2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so be hon 10: ");
        int numb = scanner.nextInt();

        String EngNum;

        switch (numb){
            case 1:
                EngNum = "One";
                break;
            case 2:
                EngNum = "Two";
                break;
            case 3:
                EngNum = "Three";
                break;
                case 4:
                EngNum = "Four";
                break;
            case 5:
                EngNum = "Five";
                break;
            case 6:
                EngNum = "Six";
                break;
            case 7:
                EngNum = "Seven";
                break;
            case 8:
                EngNum = "Eight";
                break;
            case 9:
                EngNum = "Nine";
                break;
                case 10:
                EngNum = "Ten";
                break;
            default:
                EngNum = " So khong hop le";

        }
        System.out.println("So" + numb + "viet bang tieng Anh la: " + EngNum);
    }
}
