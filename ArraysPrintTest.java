package chapter1;

public class ArraysPrintTest {

	public static void main(String[] args) {
int[] num;
num=new int[5];
System.out.println("num="+num);
System.out.println("数组中的元素为：");
for (int i=0; i<5;i++){
	System.out.println(i+"\t"+num[i]);
	/*System.out.println(0+"\t"+num[0]);
	System.out.println(1+"\t"+num[1]);
	System.out.println(2+"\t"+num[2]);
	System.out.println(3+"\t"+num[3]);
	System.out.println(4+"\t"+num[4]);
	*/
}
	}

}
