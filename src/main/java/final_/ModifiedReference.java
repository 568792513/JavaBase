package final_;

import java.util.Arrays;

/**
 * @Author zh
 * @Date 2021/4/14 10:56
 * description :
 */
public class ModifiedReference {
    public static void main(String[] args) {
        // 修饰基本类型
        final int a = 20;
        // final空白，初始化时未赋值，无法直接使用
        final int b;
        // 无法修改基本类型对应的值
        // a = 30；

        // 修饰引用数据类型
        final int[] arrays = {1, 2, 3, 4};
        final AObject aObject = new AObject();
        aObject.name = "nihao";
        // 可以修改数组内的值
        arrays[0] = 20;
        System.out.println(Arrays.toString(arrays));
        // 可以对象的属性值
        aObject.name = "aa";
        System.out.println(aObject.name);
        // 无法修改数组、对象对应的地址
        // arrays = new int[]{1, 2, 3, 4};
        // aObject = new AObject();
    }
}
