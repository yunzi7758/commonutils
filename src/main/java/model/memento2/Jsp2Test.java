package model.memento2;

public class Jsp2Test {

	public static void main(String[] args) {
  		Applicant applicant = new Applicant();
  	  Principal principal = new Principal(); 
  	  
  	System.out.println("�ָ���:"+String.valueOf(applicant.setState("��2��"))); //�ı������˶����״̬ 
  	principal.saveProcessor(applicant.createProcessor());//��������¼���󣬲��洢�����˶���״̬  
  	
  	System.out.println("����ǰ�汾:"+String.valueOf(applicant.setState("����"))) ;  //��������˶���״̬   	 
  	  applicant.restoreProcessor(principal.retrieveProcessor()); //�ָ������˶���״̬    
	}
}
