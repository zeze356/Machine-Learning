package com.kita.first.practice;

public class Practice2 {
	public static void main(String[] args) {
	
	/*
	 *  name
	 *  age
	 *  vision
	 *  bloodType
	 *   
	 *  제 이름은 ooo이고 나이는 oo살입니다.
	 *  시력은 0.0이고 혈액형은 o형입니다.
	
	 */
		String name = "제우민";
		int age = 25;
		float vision = 0.1f;
		char bloodType = 'B';
		
	System.out.println("제 이름은 " +name+"이고 나이는"+age+"살 입니다.");
	System.out.println("시력은 " + vision +"이고 혈액형은 "+bloodType+"형 입니다.");
	
	System.out.printf("제 이름은 %s이고 나이는 %s살입니다.", name, age);
	System.out.printf("시력은 %.1f이고 혈액형은 %c형입니다.", vision, bloodType);
	
	
	
	}
			
		
	
	

}
