package lamda;

import java.util.stream.Stream;

/**
 * @Author zh
 * @Date 2021/1/27 15:11
 * description :
 */
public class Reduce {
    public static void main(String[] args) {
        Integer result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, (sum, a) -> sum + a);
        System.out.println(result);
    }
}
