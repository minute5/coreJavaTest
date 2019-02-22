/**
 * @author zongw.lee@gmail.com
 * @since 2019/02/22
 */
public class Day implements Comparable<Day> {

    private int year;

    public Day(int year) {
        this.year = year;
    }

    /**
     * @desc 重写compareTo<T t>函数。通过year来比较，如果return 的大于0 则当前类排在比较类的后面
     * 如果return 的小于0 则当前类排在比较类的前面
     */
    public int compareTo(Day otherDay) {
        return year - otherDay.year;
    }

    @Override
    public String toString() {
        return "year=" + year;
    }

    public int getYear() {
        return year;
    }
}
