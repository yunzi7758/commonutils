package model.decorator2;

/*
 @author jianghc  ConcreteComponent �� ����һ�����󣬿��Ը�����������һЩְ�� 
 Ա��С�ŵĿ��������Ա��������
 */
public class YearExamineeRecord extends ExamineeRecord {
	//Ա��С�ŵĿ������
	public String record() {
		String a1="Ա��:С��   ���ţ��г�";
		String a2="���������  ƽ���� 3.5  2010��ȿ��˷�  3.6";
		String a3="  .......";
		System.out.println("Ա��:С��   ���ţ��г�");  
		System.out.println("���������  ƽ���� 3.5  2010��ȿ��˷�  3.6");
		System.out.println("  .......");
		return a1+a2+a3;
	}
	//����������
	public String signature(String name) {
		String a="������";
		System.out.println("�����ˣ�"+name);
		return a+name;
	}
}
