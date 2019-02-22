import java.util.Comparator;

/**
 * @author zongw.lee@gmail.com
 * @since 2019/02/22
 */
public class AscOperation implements Comparator<Day> {
    /**
     * @desc compare<T t1,T t2>函数。通过year来比较，如果return 的大于0 则前一位排在后一位的后面
     * 如果return 的小于0 则前一位排在后一位的的前面
     */
    public int compare(Day day1, Day day2) {
        return day1.getYear() - day2.getYear();
    }
}
