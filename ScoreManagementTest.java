import java.util.*;
import java.awt.*;
public class ScoreManagementTest {

	public static void main(String[] args) {
		float[] courseScore={78,80,60,90,59};
		String[] courseName={"���������","java�������","�ߵ���ѧ","��ѧӢ��","���ݽṹ"};
		float sum=0;
		System.out.println("��ĳɼ����£�");
		for(int i=0;i<courseName.length;i++){
			sum+=courseScore[i];
			if(courseScore[i]<60){
				System.out.println(courseName[i]+":"+courseScore[i]+"�ɼ�������");
			}
			else{System.out.println(courseName[i]+":"+courseScore[i]+"�ɼ�����");
			
			}
		}
				
System.out.println("���ƽ����"+sum/courseScore.length);
	}

}
