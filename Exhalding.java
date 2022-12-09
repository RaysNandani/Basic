package in.co.rays;

import java.lang.invoke.StringConcatException;

public class Exhalding extends Exception1 {
public static void main(String[] args) {
	String name = "vijay";
	 try {
		 System.out.println(name.length());
		 System.out.println(name.charAt(4));
	 }catch(NullPointerException e) {
	 System.out.println(" Null data or empty data");
	 e.printStackTrace();
	 }finally {
		 System.out.println("pandit hu main");
		 
	 }
}
}
