package final_;

/**
 * @Author zh
 * @Date 2021/4/14 11:18
 * description :
 */
public class Son extends Father {
    // 无法重写
    // public final void fun() {
    //
    // }

    public static void main(String[] args) {
        Son son = new Son();
        // 父类的final方法fun可以被子类继承
        son.fun();
    }
}
