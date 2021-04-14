package polymorphism;

/**
 * @Author zh
 * @Date 2021/4/14 10:41
 * description :
 */
public class MainClass {
    public static void main(String[] args) {
        /*
        Person person = new Person();
        person.run();
        */
        // Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
        // 此处声明是Person 实际是new Student
        Person person = new Student();
        person.run();

        // 多态是指，针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法。



    }
}
