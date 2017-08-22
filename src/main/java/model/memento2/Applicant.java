package model.memento2;

//խ�ӿڻ��ߺ���ʵ��    
//�����˽�ɫ    Originator
public class Applicant {
	private String state;

	public Applicant() {
	}

	// ���ù�������������ĳһ�±���¼����
	public Processorjudge createProcessor() {
		return new Processor(this.state);
	}

	// ʹ�����˻ָ�������¼�����Ѽ�¼֮״̬
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

	protected class Processor implements Processorjudge { // Processor����¼��ɫ
		private String savedState;

		private Processor(String severalState) {//�ⲿ����ڲ����˽�з���
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