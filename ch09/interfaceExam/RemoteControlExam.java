package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteControlExam {

	public static void main(String[] args) {
		// 인터페이스 활용한 리모컨 기능활용
		Scanner scanner = new Scanner(System.in);
		RemoteControl rc = null;
		Internet inet = null;
		boolean run = true;
		System.out.println("리모컨 인터페이스를 사용합니다.");
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.TV | 2.오디오 | 3.SmartTV | 4.종료");
			System.out.println("---------------------------------");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television();
				rc.turnOn();
				rc.setVolume(10);
				rc.turnOff();
				break;
			case 2:
				rc = new Audio();
				rc.turnOn();
				rc.setVolume(20);
				rc.turnOff();
				break;
			case 3:
				rc = new SmartTV();
				inet = new SmartTV();
				rc.turnOn();
				inet.wifi();
				rc.setVolume(50);
				System.out.println("url을 입력하세요.");
				System.out.print(">>>");
				String sc = scanner.next();
				inet.seachURL(sc);
			case 4:
				run = false;
				break;
			default:
				System.out.println("1~4 값만 입력하세요.");

			}
		}
		scanner.close();

	}

}
