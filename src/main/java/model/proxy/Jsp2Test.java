package model.proxy;

public class Jsp2Test {

	public static void main(String[] args) {
		//����λ���lidong
		ITraining training = new LidongTraining("�");
		//Ȼ���ٶ���һ��������
		ITraining proxy = new ManProxy(training);
		//��ʼ��ѵ������ʱ���
		System.out.println("��ʼʱ�䣺2011-8-2 13:00");	
		System.out.println(proxy.meeting("lidong", "team"));//�μ���ѵ�����
		System.out.println(proxy.joinTraining());//�μ���ѵ
		System.out.println(proxy.joinExam());//����
		 System.out.println("����ʱ�䣺2011-8-2 15:30");
	}
}
