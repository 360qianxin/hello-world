package chapter1;

import java.util.Arrays;

public class ArraysSortTest {
		private static final int position = 3;

		public static void main(String[] args) {
int[] a={9,7,5,8,4};
Arrays.sort(a);
for(int i=0;i<a.length;i++){
	System.out.print(a[i]+"");
	}
System.out.println();
int possition =Arrays.binarySearch(a, 8);
if(position != -1){
	System.out.println("�ҵ��ˣ�λ����"+position);
}
else{System.out.println("û�ҵ�����Ҫ�ҵ�Ԫ��");
	}

}
}