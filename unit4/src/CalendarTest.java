import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author jj
 * @date 2019/6/27-8:53 PM
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();                     //获得当前的时间
        int month=date.getMonthValue();                     //获得当前的月（用于循环判断）
        int today=date.getDayOfMonth();                     //获得这个月的第几天（用于保存今天是第几天）

        date=date.minusDays(today-1);                       //将时间设为这个月的第一天
        DayOfWeek weekday=date.getDayOfWeek();              //获得这个星期的第几天
        int value=weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i <value; i++) {
            System.out.print("    ");
        }

        while(date.getMonthValue()==month){                 //获得一个月
            System.out.printf("%3d",date.getDayOfMonth());  //这个月的第几天（最大31）
            if(date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1) System.out.println();
        }
        if(date.getDayOfWeek().getValue()==1) System.out.println();
    }
}
