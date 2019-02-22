import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zongw.lee@gmail.com
 * @since 2019/02/22
 */
public class Main {
    public static void main(String[] args){
        List<Day> days = new ArrayList<Day>();
        days.add(new Day(2018));
        days.add(new Day(2017));
        days.add(new Day(2019));
        Collections.sort(days);
        System.out.printf("list:%s\n",days);
        Collections.sort(days,new DescOperation());
        System.out.printf("list:%s\n",days);
        Collections.sort(days,new AscOperation());
        System.out.printf("list:%s\n",days);
    }
}
