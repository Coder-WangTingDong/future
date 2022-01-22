package com.fwtd.algorithm;

/**
 * @classname: SelectSort
 * @description: 选择排序
 * 第一次从待排序的数据元素中选出最小(或最大)的一个元素,存放在序列的起始位置,
 * 然后再从剩余的未排序元素中寻找到最小(大)元素,然后放到已排序的序列的末尾
 * 重复第二步，直到所有元素均排序完毕。
 * @date: 2021/12/13/8:29 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class SortSelect {

    public static void sort(int[] arr) {
        // 数组为空或长度小于2，无需排序
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            // 记录最小值的索引
            int minIndex = i;
            // 从最小值的后一位开始遍历，判断是否有比最小值还小的，有，变更最小值的索引
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            // 交换位置
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int minIndex, int swapIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[swapIndex];
        arr[swapIndex] = temp;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 10, 23, 4, 6, 15, 20, 58, 5, 10};
        print(arr);
        sort(arr);
        print(arr);
    }
}
