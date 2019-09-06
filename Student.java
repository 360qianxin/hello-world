package chapter1;


	public class Student {
	    String name;   //姓名
	    int age;           //年龄
	    String classNo;    //班级
	    String hobby;     //爱好
	    //输出信息方法
	    public void show(){
	        System.out.println(name + "\n年龄：" + age + "\n就读于：" +
	            classNo + "\n爱好：" + hobby);
	    }
	}