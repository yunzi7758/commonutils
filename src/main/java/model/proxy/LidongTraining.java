package model.proxy;

/**  ��ʵʵ����
 * @author jackjiang
 */
public class LidongTraining implements ITraining {
	private String name = "";
	//ͨ�����캯����������
	public LidongTraining(String _name){
		this.name = _name;
	}
	public String joinExam() {
		String joinExam="����ѵ��";
		System.out.println(this.name + "����ѵ��");
		return this.name+joinExam;
	}
    //���뿼��
	public String joinTraining() {
		String joinTraining="���뿼�ԣ�";
		System.out.println(this.name + " ���뿼�ԣ�");
		return this.name+joinTraining;
	}
	//������ѵ���������ң�ǰ��
	public String meeting(String employee, String team) {
		String a="�λ�����Ϊ";
		String b="��Ա��";
		String c="��������ҳɹ���";
		System.out.println("�λ�����Ϊ"+employee + " ��Ա�� " + this.name + "��������ҳɹ���");
		return a+employee+b+ this.name +c;
	}
}
