package com.fwtd.algorithm;

/**
 * @classname: SortBubble
 * @description: 冒泡排序
 * @date: 2021/12/13/8:29 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class SortBubble {

    public static void sort(int[] arr) {
        // 数组为空或长度小于2，无需排序
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
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
        int arr[] = {12, 45, 10, 23, 4, 6, 15, 20, 58, 5, 10};
        print(arr);
        sort(arr);
        print(arr);
    }
}
