package model.memento2;

////负责人角色 
public class Principal {
	private Processorjudge processorjudge; //备忘录角色 

	public Processorjudge retrieveProcessor() { //恢复备忘录 
		return this.processorjudge;
	}

	public void saveProcessor(Processorjudge processorjudge) {
		this.processorjudge = processorjudge;
	}
}
