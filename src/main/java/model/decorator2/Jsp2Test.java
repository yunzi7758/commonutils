package model.decorator2;

public class Jsp2Test {

	public static void main(String[] args) {
      //考核情况
  		// 考核报告
  		ExamineeRecord er;
  		er = new YearExamineeRecord();  //员工现有考核情况     
  		//部门考核最高分
  		er = new TiptopPointDecorator(er);
  		//考核排名
  		er = new OrderDecorator(er);
  		//考核情况显示
  		//er.record();
  		//er.signature("袁东");  //评价人姓名	
  		System.out.println("查看考核情况:"+er.record());	

  		System.out.println("签字"+er.signature("李东"));
	}
}
