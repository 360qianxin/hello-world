package chapter1;

public class 二维数组 {

		public static void main(String[] args) {

		String[][] a = { { "面向对象程序设计教师：张林","","面向程序设计作业","","9组组长：王冉","9组成员：王冉 韩雷 宋泽训 王超 张林海","","潍坊科技学院", "中印计算机软件学院", "2016级","计算机应用4班","", "导员：王琦",
			"班长：赵桂栋","团支书：孟洁","面向对象程序设计课代表:孟繁森","设计时间：2017年10月20日" ,"制作者：张林海"}, {}, {}, {} };

		for (int i = 0; i < a.length; i++) {

		for (int j = 0; j < a[i].length; j++) {

		System.out.println("\t" + a[i][j]);

		}

		System.out.println();

		}

		}

		}
