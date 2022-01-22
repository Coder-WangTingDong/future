package com.fwtd.algorithm;

/**
 * @classname: SortInsert
 * @description: 插入排序
 * @date: 2021/12/13/8:29 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class SortInsert {
    public static void sort(int[] arr) {
        // 数组为空或长度小于2，无需排序
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            // 从当前索引的前一位开始比较，如果>=0说明前面还有值可以比较，并且前一个值比当前值大，则交换，然后继续与下一位比较
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
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
