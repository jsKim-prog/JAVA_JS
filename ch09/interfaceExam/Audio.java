package ch09.interfaceExam;

public class Audio implements RemoteControl{//구현체
	int volume=0;
	
	//인터페이스의 추상메서드들의 기능을 구현한다.
	@Override
	public void turnOn() {
		System.out.println("오디오의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오의 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
			RemoteControl.setMute(true); //static으로 변경하여 new 없이 가져오기 가능
		}//--if()
		System.out.println("현재 오디오 볼륨 : "+volume);
	} 

}
