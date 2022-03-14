package com.tanky.algorithm.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 堆排序的非递归实现
 * [4,3,5,6,8,1,2,0,8,4]
 * n节点的左、右孩子节点分别是2n+1和2n+2
 *
 * @author zhangzhongguo
 * @date 2022/03/14
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] arr = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }

        System.out.println();
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println(date1Str);

        heapSort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println(date2Str);
    }

    public static void heapSort(int arr[]) {
        int temp = 0;

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int j = arr.length - 1; j > 0; j--) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }


    }


    public static void adjustHeap(int arr[], int i, int lenght) {
        int temp = arr[i];
        //1. k = i * 2 + 1 k
        for (int k = i * 2 + 1; k < lenght; k = k * 2 + 1) {
            if (k + 1 < lenght && arr[k] < arr[k + 1]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

}
