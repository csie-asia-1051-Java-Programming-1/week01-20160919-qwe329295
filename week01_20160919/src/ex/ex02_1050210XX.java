package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021028 蕭佑誠
 */
 import java.util.Scanner;
public class ex02_1050210XX{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入公斤數");
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = 0;
		b = a*0.45359;
		System.out.println(b);

	}

}
