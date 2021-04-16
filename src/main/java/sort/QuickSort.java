package sort;

import java.util.Arrays;

/**
 * @Author zh
 * @Date 2021/4/15 11:23
 * description :
 */
public class QuickSort {
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        // 递归结束条件 左指针大于等于右指针时
        if (startIndex >= endIndex) {
            return;
        }
        // 基准位置
        int pivotIndex = unilateralLoopPartition(array, startIndex, endIndex);
        // 递归调用左右两边快排
        // 左
        quickSort(array, startIndex, pivotIndex - 1);
        // 右
        quickSort(array, pivotIndex + 1, endIndex);
    }

    /**
     * 双边循环法
     * @param array 待交换数组
     * @param startIndex 数组开始下标
     * @param endIndex 数组结束下标
     * @return
     */
    public static int bilateralLoopPartition(int[] array, int startIndex, int endIndex) {
        // 取第一个元素为基轴
        int pivot = array[startIndex];
        // 赋值左右指针
        int left = startIndex;
        int right = endIndex;
        // 开始循环 当左右指针不一致时继续
        while (left != right) {
            // 移动右指针
            while (left < right && pivot <= array[right]) {
                right --;
            }
            // 移动左指针
            while (left < right && pivot >= array[left]) {
                left ++;
            }
            // 左右指针停止时，交换左右指针值
            if (left < right) {
                swap(array, left, right);
            }
        }
        // 左右指针重合时，将基轴交换到重合位置
        array[startIndex] = array[left];
        array[left] = pivot;
        return left;
    }

    /**
     * 单边循环法
     * @param array 待交换的数组
     * @param startIndex 起始下标
     * @param endIndex 结束下标
     **/
    public static int unilateralLoopPartition(int[] array, int startIndex, int endIndex) {
        // 取第一个元素为基轴
        int pivot = array[startIndex];
        // 初始化mark
        int mark = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (array[i] < pivot) {
                // mark 右移
                mark++;
                // 交换mark和i指向的值
                int p = array[mark];
                array[mark] = array[i];
                array[i] = p;
            }
        }
        array[startIndex] = array[mark];
        array[mark] = pivot;
        return mark;
    }

    public static void swap(int[] arrays, int x, int y) {
        int temp = arrays[x];
        arrays[x] = arrays[y];
        arrays[y] = temp;
    }

    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        quickSort(ns, 0, ns.length - 1);
        System.out.print(Arrays.toString(ns));
    }
}
