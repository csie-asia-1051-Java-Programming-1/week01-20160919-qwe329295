package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
 * Author: 105021028 蕭佑誠
 */
  import java.util.Scanner;
public class ex04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入a");
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b =(Math.sqrt(a));
		System.out.println(b);

	}

}
