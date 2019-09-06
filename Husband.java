package chapter1;

class Husband {
	class Person1 {

	       public String name = "xiaomiao";

	       public int age = 20;

	}

	 

	class Student extends Person1 {

	       void study() {

	              System.out.println("I can study!");

	       }

	}

	 

	public class JiCheng {

	       public void main(String args[]) {

	              Student stu = new Student();

	              // stu.name = "zhangsan";

	              // stu.age = 20;

	              System.out.println("name=" + stu.name + ",,," + "age=" + stu.age);

	       }

	}}