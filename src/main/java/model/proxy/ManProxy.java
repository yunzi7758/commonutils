package model.proxy;

/** 代理类
 * @author jackjiang 代替开会者
 */
public class ManProxy implements ITraining {
	private ITraining training = null;
	//构造函数传递谁代替李东参加培训
	public ManProxy(ITraining _training){
		this.training = _training;
	}
	public String joinExam() {//参与培训
		return this.training.joinExam();
	}
	public String joinTraining() {//参与考试
		return this.training.joinTraining();
	}
	public String meeting(String user, String team) {
		return this.training.meeting(user, team);
	}
}
