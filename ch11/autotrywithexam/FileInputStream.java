package ch11.autotrywithexam;

public class FileInputStream implements AutoCloseable{ //AutoClosable 구현 필수
	//필드
	private String file;

		
	//생성자
	public FileInputStream(String file) {
		super();
		this.file = file;
	}
	
	//메서드
	public void read() {
		System.out.println(file+" 을 읽습니다.");
	} //파일 읽기

	@Override //AutoCloseable 구현시 필수
	public void close() throws Exception {
		System.out.println(file+" 을 닫습니다.");
		
	}//예외를 받아서 자동으로 close()실행
	
	

}
