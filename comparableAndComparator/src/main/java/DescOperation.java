import java.util.Comparator;

/**
 * @author zongw.lee@gmail.com
 * @since 2019/02/22
 */
public class DescOperation implements Comparator<Day> {
    public int compare(Day day1, Day day2) {
        return day2.getYear() - day1.getYear();
    }
}
