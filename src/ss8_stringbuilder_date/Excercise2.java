package ss8_stringbuilder_date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.ParseException;

/*
Chuyển đổi và thao tác với kiểu dữ liệu ngày tháng
*/
public class Excercise2 {
    public static void main(String[] args) {
        /*a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.*/

        System.out.println("a. Tạo một SimpleDateFormat với định dạng \"MM/dd/yyyy\".");
        String strDate = "02/28/2023";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = sdf.parse(strDate);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date
         sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình..*/

        System.out.println("b. Tạo một đối tượng java.util.Date hiện tại bằng cách sử dụng Date().");
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String strDate1 = sdf1.format(date);
        System.out.println(strDate1);

        /*c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.*/

        System.out.println("c. Chuyển chuỗi \"02/28/2023\" sang kiểu LocalDate.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String strDate2 = "02/28/2023";
        LocalDate localDate = LocalDate.parse(strDate2, dtf);
        System.out.println(localDate);

        /*d. Chuyển ngày hiện tại đang ở kiểu LocalDate sang kiểu String
        theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.*/

        System.out.println("d. Chuyển ngày hiện tại đang ở kiểu LocalDate sang" +
                " kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.");
        LocalDate nowDate = LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strNowDate = nowDate.format(dtf2);
        System.out.println(strNowDate);

        /*e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.*/

        System.out.println("e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.");
        LocalDateTime nowDateTime = LocalDateTime.now();
        int day = nowDateTime.getDayOfMonth();
        int hour = nowDateTime.getHour();
        int minute = nowDateTime.getMinute();
        int second = nowDateTime.getSecond();
        System.out.println("Ngay: " + day);
        System.out.println("Gio: " + hour);
        System.out.println("Phut: " + minute);
        System.out.println("Giay: " + second);

        /*f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong
        tuần, và cách ngày hiện tại bao nhiêu ngày?*/

        System.out.println("Hãy cho biết 1 tháng sau (tính từ ngày hiện tại)" +
                " sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?");
        LocalDate nextMonth = nowDate.plusMonths(1);
        System.out.println("Thang sau: " + nextMonth);
        System.out.println("Thu: " + nextMonth.getDayOfWeek());
        System.out.println("Khoang cach la: " + nowDate.until(nextMonth).getDays() + " ngay");

        /*g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?*/

        System.out.println("Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?");
        LocalDate beforeDays = LocalDate.now().minusDays(1000);
        System.out.println("Ngay truoc 1000 ngay: " + beforeDays);

        /*h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy. Hãy chuyển thành
        2 biến kiểu LocalDate. Sau đó hãy tính số ngày chênh lệch giữa 2 ngày*/

        System.out.println("Hãy nhập vào 2 String có định dạng là dd/MM/yyyy. Hãy chuyển thành" +
                " 2 biến kiểu LocalDate. Sau đó hãy tính số ngày chênh lệch giữa 2 ngày");
        String datestr1 = "01/01/2021";
        String datestr2 = "01/01/2022";
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(datestr1, dtf3);
        LocalDate date2 = LocalDate.parse(datestr2, dtf3);
        System.out.println("So ngay chenh lech giua 2 ngay: " + date1.until(date2).getDays());

        /*i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy. Sau đó, nhập
        vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.*/

        System.out.println("Hãy nhập vào 1 String có định dạng là dd/MM/yyyy. Sau đó, nhập" +
                " vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.");

        String datestr3 = "01/01/2021";
        int n = 4;
        LocalDate date3 = LocalDate.parse(datestr3, dtf3);
        LocalDate afterDate = date3.plusDays(n);
        System.out.println("Ngay sau " + n + " ngay: " + afterDate);
    }
}
