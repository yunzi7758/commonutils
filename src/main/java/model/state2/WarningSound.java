package model.state2;

public class WarningSound { //����������-Context������
	private SoundState state = new MiddleSound();
	public void setState(SoundState state) {
		this.state = state;
	}
	public String Sound() {
		return state.Sound();
	}
}