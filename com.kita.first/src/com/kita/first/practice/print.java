package com.kita.first.practice;

public class print {
	public static void main(String[] args) {
//		System.out.print();
//		System.out.println();
//		System.out.printf("문자열 형식",arg1, arg2...);
		
/*		int age =10;
		String name = "김땡떙";
		
		// 김땡땡은 10살이다.
		System.out.println("김땡땡은 10살이다");
		System.out.println(name +"은" + age +"살이다.");
		
		System.out.printf("%s은 %d살이다.", name,age);*/
		
		/*
		 * 올해로 20살이 된 김땡땡은
		 * 알바를 시작하여 매달 123만원을 받게 되었다.
		 * 김땡땡은 월급의 50%인 615000원을 떼어
		 * A 저축은행의 연 이자율 2.33%짜리 적금에 넣기로 결심했다.
		 * */
		
		int age = 20;
		String name = "김땡땡";
		int salary = 1_230_000;
		int percent = 50;
		int savings = 615_000;
		char bank = 'A'; // String bank = "A";
		double rateofinterest = 2.333333333;
		
		System.out.printf("올해로 %d살이 된 %s은 \n알바를 시작하여 매달 %,d원을 받게 되었다.",age,name,salary);
		System.out.printf("\n%s은 월급의 %d%%인 %,d원을 떼어\n%c 저축은행의 연 이자율 %.2f%%짜리 적금에 넣기로 결심했다.",name,percent,savings,bank,rateofinterest);
		
		
		
	
		
		
		
		
	}
	}