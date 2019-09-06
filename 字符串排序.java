package chapter1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class �ַ�������{

    private static Set<String> set = new HashSet<String>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        permutation(chars, 0);
        System.out.print(set);
    }

    /**
     * ����Ԫ�ؽ�������ַ���ô���
     */
    static void swap(char[] arr, int idx1, int idx2) {
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    /**
     * �ݹ�����
     */
    static void permutation(char[] chars, int index) {
        // �ݹ����
        if (index == chars.length) {
            // ��ӵ�set�У������ظ�����
            set.add(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                // ��������Ԫ��
                swap(chars, i, index);
                // ���������һλ���ݹ鿪ʼ
                permutation(chars, index + 1);
                // ��ÿһ�εݹ���ɵ�ʱ��ǵû�ԭ����Ԫ�أ���֤�����ѭ��������Դ����
                swap(chars, i, index);
            }
        }
    }
}
