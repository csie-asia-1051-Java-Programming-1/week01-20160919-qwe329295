package hw;
import java.util.Random;
import java.util.Scanner;
public class hw02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入n");
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		int w = scn .nextInt();
		
		int w1 = rnd.nextInt(w)+1;
		int w2 = rnd.nextInt(w)+1;
		int w3 = rnd.nextInt(w)+1;
		int w4 = rnd.nextInt(w)+1;
		int w5 = rnd.nextInt(w)+1;
		int w6 = rnd.nextInt(w)+1;
		
	
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		System.out.println(w6);
		
		
  
	}

}
