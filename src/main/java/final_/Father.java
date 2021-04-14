package final_;

/**
 * @Author zh
 * @Date 2021/4/14 11:17
 * description :
 */
public class Father {
    // 修饰类成员变量时，初始化必须赋值
    private final int a = 0;

    public final void fun() {
        System.out.println("Father.fun");
    }
}
