package hw;
import java.util.Random;
import java.util.Scanner;
public class hw03_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入n");
		int a = scn.nextInt();
		
		int a1 = rnd.nextInt(a)+1;
		int a2 = rnd.nextInt(a)+1;
		int a3 = rnd.nextInt(a)+1;
		int a4 = rnd.nextInt(a)+1;
		int a5 = rnd.nextInt(a)+1;
		int a6 = rnd.nextInt(a)+1;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		
		
		
	}

}
