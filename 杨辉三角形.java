package chapter1;

import java.util.Scanner;

/**
 * @author caojiantao-ext �������
 */
public class ���������  {

    // д�ڲ�ѭ��ʱע����Ʒ�Χ
    public static void main(String[] args) {
        System.out.print("������������ǵ�������");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int num[][] = new int[count][count];
        // Ԥ������Խ�磬��ʼ�����е�ֵ
        for (int loop = 0; loop < count; loop++) {
            num[loop][0] = 1;
        }
        // ����������ǵĹ��򣬸���ά���鸳ֵ����
        for (int row = 1; row < count; row++) {
            for (int column = 1; column <= row; column++) {
                num[row][column] = num[row - 1][column] + num[row - 1][column - 1];
            }
        }
        // ѭ����ӡ
        for (int row = 0; row < count; row++) {
            for (int i = 0; i < 2 * (count - row) - 1; i++) {
                System.out.print(" ");
            }
            for (int column = 0; column <= row; column++) {
                // ������ƣ���������
                System.out.printf("%-4d", num[row][column]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
