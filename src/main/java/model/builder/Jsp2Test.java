package model.builder;

public class Jsp2Test {

	public static void main(String[] args) {
//		����һ�������߶���
		SiemensWasherBuilder builder = new SiemensWasherBuilder();
//		����һ�������ߣ���Ϊ������һ��������
		SiemensDirector directorOne = new SiemensDirector(builder);	
//		�����߽�֪ͨ������ȥ������Ʒ
//		����������У������߽�����ݵ����ߵ�����ȥ������֯��������Ʒ����
		directorOne.contruct();		
//		�Ӿ��彨�����м�����Ʒ�����ص��Ǳ�������ӣ���
		SiemensWasher siemensWasher = builder.retrieveWasher();	
		
		System.out.println(siemensWasher);
	}
}
