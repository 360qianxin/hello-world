package chapter1;

public class ¦Ð
{

	  public static void main(String[] args){
	    double pi=0;
	    double dx=1e-3;
	    for(double x=-100;x<=+100;x+=dx){
	      pi+=Math.exp(-x*x)*dx;
	    }
	    System.out.println(pi*pi);
	  }
	}