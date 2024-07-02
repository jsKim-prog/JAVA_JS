package ch09.abstractExam;

import java.util.Scanner;

public class ShapeExam {

	public static void main(String[] args) {
		// 추상클래스를 이용해 도형의 색상과 면적구하기
		Scanner input = new Scanner(System.in);
		Shape sh = null;
		
		boolean run=true;
		while(run) {
			
			System.out.println("1. 원면적 | 2. 사각형 면적 | 3. 종료");
			System.out.print(">>>");
			int select = input.nextInt();
			System.out.println("색상 : ");
			System.out.print(">>>");
			String inStr=input.next();
			switch(select) {
			case 1:
				System.out.println("반지름 : ");
				System.out.print(">>>");
				double radius =input.nextDouble();
				sh=new Circle(inStr, radius);
				System.out.println(sh.toString());
				break;
			case 2:
				System.out.println("너비 : ");
				System.out.print(">>>");
				double width =input.nextDouble();
				System.out.println("높이 : ");
				System.out.print(">>>");
				double length =input.nextDouble();
				sh=new Rectangle(inStr, length, width);	
				System.out.println(sh.toString());
				break;
			case 3:
				System.out.println("종료합니다.");
				run=false;
				break;
				default :
					System.out.println("1~3번만 입력하세요.");
				
			}//--switch()
		}//--while()
		input.close();
	}

}
