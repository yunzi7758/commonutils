package model.proxy;

/** ������
 * @author jackjiang ���濪����
 */
public class ManProxy implements ITraining {
	private ITraining training = null;
	//���캯������˭������μ���ѵ
	public ManProxy(ITraining _training){
		this.training = _training;
	}
	public String joinExam() {//������ѵ
		return this.training.joinExam();
	}
	public String joinTraining() {//���뿼��
		return this.training.joinTraining();
	}
	public String meeting(String user, String team) {
		return this.training.meeting(user, team);
	}
}
