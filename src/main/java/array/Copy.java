package array;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author zh
 * @Date 2021/1/25 15:17
 * description :
 */
public class Copy {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        List<Integer> b = List.copyOf(a);
        b.add(3);
        System.out.println(a);
        System.out.println(b);
    }
}
