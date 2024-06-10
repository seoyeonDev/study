package bronze;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class B10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(fm.format(date));
    }
}
