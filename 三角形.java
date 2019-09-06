package chapter1;

public class 三角形 {
    public static void main(String[] args) {
        int a,b;
        for (a=1;a<=9;a++)//外层循环
        {
            for (b=1;b<=a;b++)//内层循环

                System.out.print(a+"*"+b+"="+(a*b)+"\t");
            System.out.println();

        }

    }
}