package 十大排序算法.冒泡排序;

import java.util.Arrays;

/**
 * @author zhou
 * @create 2021-7-13 12:43
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {

        boolean flag = true;

        for (int i = 0; i < nums.length - 1 & flag; i++) {

            flag = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    flag = true;
                }
            }
        }
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
