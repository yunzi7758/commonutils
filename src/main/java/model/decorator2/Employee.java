package model.decorator2;

/*
 @author jianghc  
   员工类，用于员工小张查看年度考核明细
 */
public class Employee {
	public static void main(String[] args) {
		// 考核报告
		ExamineeRecord er;
		er = new YearExamineeRecord();  //员工现有考核情况     
		//部门考核最高分
		er = new TiptopPointDecorator(er);
		//考核排名
		er = new OrderDecorator(er);
		//考核情况显示
		er.record();
		er.signature("袁东");  //评价人姓名
	}
}
