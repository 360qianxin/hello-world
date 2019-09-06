package chapter1;

import java.util.Scanner;

/**
 * @author caojiantao-ext 杨辉三角
 */
public class 杨辉三角形  {

    // 写内层循环时注意控制范围
    public static void main(String[] args) {
        System.out.print("请输入杨辉三角的行数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int num[][] = new int[count][count];
        // 预防数组越界，初始化首列的值
        for (int loop = 0; loop < count; loop++) {
            num[loop][0] = 1;
        }
        // 根据杨辉三角的规则，给二维数组赋值处理
        for (int row = 1; row < count; row++) {
            for (int column = 1; column <= row; column++) {
                num[row][column] = num[row - 1][column] + num[row - 1][column - 1];
            }
        }
        // 循环打印
        for (int row = 0; row < count; row++) {
            for (int i = 0; i < 2 * (count - row) - 1; i++) {
                System.out.print(" ");
            }
            for (int column = 0; column <= row; column++) {
                // 输出控制，完美等腰
                System.out.printf("%-4d", num[row][column]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
