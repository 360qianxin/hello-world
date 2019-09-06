package chapter1;

public class StudentPoll {

	public static void main(String[] args) {
int[] answers={3,1,2,5,4,2,2,3,4,5,1,2,3,4,2,1,3,2,4,2};
int[] frequency=new int[6];

for(int i=0;i<20;i++){
	frequency[answers[i]]++;}
System.out.println("分值\t学生数");
for(int i=1;i<6;i++){
	System.out.println(i+"\t"+frequency[i]);
	}

}
}
