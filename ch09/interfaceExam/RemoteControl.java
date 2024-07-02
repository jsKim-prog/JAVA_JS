package ch09.interfaceExam;

public interface RemoteControl { //기능모음1
	//상수 ->변하지 않는값+초기값!
	public /* static final */ int MAX_VOLUME = 10;
	public /* static final */ int MIN_VOLUME = 0;
	
	//메서드 
	//메서드1(기본)-추상메서드
	public void turnOn(); //전원ON
	public void turnOff(); //전원 OFF
	public abstract void setVolume(int volume); //볼륨조절
	
	//메서드2(선택)-디폴트메서드
	
	
	//메서드3(선택)-정적메서드
	static void changeBattery() {
		System.out.println("건전지를 교체하세요.");
	}
	
	static void setMute(boolean mute) {
		if(mute) { //음소거=true
			System.out.println("음소거");
			
		}else {//음소거=fales
			System.out.println("음소거 해제");
		}//--if()
	}

}
