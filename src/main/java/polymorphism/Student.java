package polymorphism;

/**
 * @Author zh
 * @Date 2021/4/14 10:36
 * description :
 */
public class Student extends Person{
    @Override
    public void run() {
        System.out.println("Student.run");
    }

    // overload 重载  方法签名不同
    public void run(String a) {

    }
}
