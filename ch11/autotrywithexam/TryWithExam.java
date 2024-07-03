package ch11.autotrywithexam;

import java.util.Scanner;

public class TryWithExam {

	public static void main(String[] args) {
		// 예외 발생 여부와 상관없이 사용했던 리소스 객체(입출력 스트림, 서버 소켓, 각종 채널)의 close() 메소드를 호출해서 안전하게 리소스를 닫아준다. 
		//파일의 데이터를 읽는 FileInputStream 객체와 파일에 쓰는 FileOutputStream은 리소스 객체임
		//try 블록이 정상적으로 실행을 완료했거나 도중에 예외가 발생하게 되면 자동으로 close() 메소드가 호출하게 된다.
		Scanner input = new Scanner(System.in);
		//Resource leak: 'input' is never closed
		
		try (FileInputStream fls = new FileInputStream(input.next())){//try-with-resource형태
			//The resource type FileInputStream does not implement java.lang.AutoCloseable
			//이 형태로 하면 이 경고 뜸
			fls.read();
			throw new Exception(); //자동으로 close()실행을 위해 강제로 오류 발생
		} catch (Exception e) {
			System.out.println("예외처리 코드 실행");
			//e.printStackTrace();
		}
		
	
	}

}
