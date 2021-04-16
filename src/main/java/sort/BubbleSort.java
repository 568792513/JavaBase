package sort;

import java.util.Arrays;

/**
 * @Author zh
 * @Date 2021/4/15 9:58
 * description :
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length; i++) {
            for (int j = i + 1; j < ns.length; j++) {
                if (ns[i] > ns[j]) {
                    swap(ns, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }

    public static void swap(int[] arrays, int x, int y) {
        int temp = arrays[x];
        arrays[x] = arrays[y];
        arrays[y] = temp;
    }
}
