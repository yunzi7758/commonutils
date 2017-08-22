package model.memento2;

public class Jsp2Test {

	public static void main(String[] args) {
  		Applicant applicant = new Applicant();
  	  Principal principal = new Principal(); 
  	  
  	System.out.println("恢复至:"+String.valueOf(applicant.setState("第2版"))); //改变申请人对象的状态 
  	principal.saveProcessor(applicant.createProcessor());//创建备忘录对象，并存储申请人对象状态  
  	
  	System.out.println("将当前版本:"+String.valueOf(applicant.setState("覆盖"))) ;  //变更申请人对象状态   	 
  	  applicant.restoreProcessor(principal.retrieveProcessor()); //恢复申请人对象状态    
	}
}
