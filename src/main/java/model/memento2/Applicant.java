package model.memento2;

//窄接口或者黑箱实现    
//发起人角色    Originator
public class Applicant {
	private String state;

	public Applicant() {
	}

	// 运用工厂方法，返还某一新备忘录对象
	public Processorjudge createProcessor() {
		return new Processor(this.state);
	}

	// 使发起人恢复至备忘录对象已记录之状态
	public void restoreProcessor(Processorjudge processorjudge) {
		Processor a_processor = (Processor) processorjudge;
		this.setState(a_processor.getState());
	}

	public String getState() {
		return this.state;
	}

	public String setState(String state) {
		this.state = state;
		System.out.println("state = " + state);
		return state;
	}

	protected class Processor implements Processorjudge { // Processor备忘录角色
		private String savedState;

		private Processor(String severalState) {//外部类调内部类的私有方法
			savedState = severalState;
		}

		private String setState(String severalState) {
			return savedState = severalState;
		}

		private String getState() {
			return savedState;
		}
	}
}