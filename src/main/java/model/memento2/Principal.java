package model.memento2;

////�����˽�ɫ 
public class Principal {
	private Processorjudge processorjudge; //����¼��ɫ 

	public Processorjudge retrieveProcessor() { //�ָ�����¼ 
		return this.processorjudge;
	}

	public void saveProcessor(Processorjudge processorjudge) {
		this.processorjudge = processorjudge;
	}
}
