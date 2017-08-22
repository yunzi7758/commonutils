package model.proxy;

/**  真实实现类
 * @author jackjiang
 */
public class LidongTraining implements ITraining {
	private String name = "";
	//通过构造函数传递名称
	public LidongTraining(String _name){
		this.name = _name;
	}
	public String joinExam() {
		String joinExam="在培训！";
		System.out.println(this.name + "在培训！");
		return this.name+joinExam;
	}
    //参与考试
	public String joinTraining() {
		String joinTraining="参与考试！";
		System.out.println(this.name + " 参与考试！");
		return this.name+joinTraining;
	}
	//进入培训讲座会议室，前提
	public String meeting(String employee, String team) {
		String a="参会者名为";
		String b="的员工";
		String c="进入会议室成功！";
		System.out.println("参会者名为"+employee + " 的员工 " + this.name + "进入会议室成功！");
		return a+employee+b+ this.name +c;
	}
}
