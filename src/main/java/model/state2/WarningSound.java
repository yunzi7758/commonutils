package model.state2;

public class WarningSound { //报警声音类-Context环境类
	private SoundState state = new MiddleSound();
	public void setState(SoundState state) {
		this.state = state;
	}
	public String Sound() {
		return state.Sound();
	}
}