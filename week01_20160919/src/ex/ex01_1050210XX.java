package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021028 蕭佑誠
 */
import java.util.Scanner;
public class ex01_1050210xx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入華氏溫度:");
		Scanner scn =new Scanner(System.in);
		double a = scn.nextDouble();
		
		
		double b = 0;
		
		
		b=(a-32)*5/9;
		System.out.println(b);
	}

}
