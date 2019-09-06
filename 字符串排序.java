package chapter1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 字符串排序{

    private static Set<String> set = new HashSet<String>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        permutation(chars, 0);
        System.out.print(set);
    }

    /**
     * 数组元素交换，地址引用传递
     */
    static void swap(char[] arr, int idx1, int idx2) {
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    /**
     * 递归排序
     */
    static void permutation(char[] chars, int index) {
        // 递归出口
        if (index == chars.length) {
            // 添加到set中，避免重复排序
            set.add(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                // 交换数组元素
                swap(chars, i, index);
                // 索引向后移一位，递归开始
                permutation(chars, index + 1);
                // 在每一次递归完成的时候记得还原数组元素，保证最外层循环的数据源不变
                swap(chars, i, index);
            }
        }
    }
}
