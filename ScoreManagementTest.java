import java.util.*;
import java.awt.*;
public class ScoreManagementTest {

	public static void main(String[] args) {
		float[] courseScore={78,80,60,90,59};
		String[] courseName={"计算机导论","java语言设计","高等数学","大学英语","数据结构"};
		float sum=0;
		System.out.println("你的成绩如下；");
		for(int i=0;i<courseName.length;i++){
			sum+=courseScore[i];
			if(courseScore[i]<60){
				System.out.println(courseName[i]+":"+courseScore[i]+"成绩不及格");
			}
			else{System.out.println(courseName[i]+":"+courseScore[i]+"成绩及格");
			
			}
		}
				
System.out.println("你的平均分"+sum/courseScore.length);
	}

}
