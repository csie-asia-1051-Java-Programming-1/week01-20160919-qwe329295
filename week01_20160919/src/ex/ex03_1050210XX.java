package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 105021028 蕭佑誠
 */
 import java.util.Scanner;
public class ex03_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入a與b");
		Scanner scn = new Scanner(System.in);
		double a = scn . nextDouble();
		double b = scn . nextDouble();
		double c = (Math.pow(a,b));
		System.out.println(c);

	}

}
