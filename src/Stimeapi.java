import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Stimeapi {
    public static void main(String[] args) {
        LocalDate current_Date = LocalDate.now();
        System.out.println(current_Date);
        System.out.println(".............");
        int dayofMonth = current_Date.getDayOfMonth();
        DayOfWeek dayOfWeek = current_Date.getDayOfWeek();
        int month = current_Date.getMonthValue();
        int year = current_Date.getYear();
        System.out.println(dayOfWeek + "," + dayofMonth + "-" + month + "-" + year);
        System.out.println(".................");
        System.out.println(".................");
        LocalDate particularDate = LocalDate.of(1800, 10, 11);
        System.out.println(particularDate);
        System.out.println();
        System.out.println(".................");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        int hour = localTime.getHour();
        int min = localTime.getMinute();
        int sec = localTime.getSecond();
        long ns = localTime.getNano();
        System.out.println(hour + "," + min+ "-" + sec+ "-" + ns);
        System.out.println("..................................");

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DayOfWeek dow = dt.getDayOfWeek();
        int dom = dt.getDayOfMonth();
        int mnth = dt.getMonthValue();
        int yr = dt.getYear();
        int hr  = dt.getHour();
        int mn = dt.getMinute();
        int snd = dt.getSecond();
        int nsd = dt.getNano();
        System.out.println(dow+","+dom+"/"+mnth+"/"+yr+" "+hr+"/"+mn+"/"+snd+"/"+nsd);
        System.out.println("...............");


    }

}
