package model.facade;

/**
 * @author jianghc
 *///�õ������õ籨�ޡ��õ����ݡ�����ҵ��
public class ElectricPowerMarketingImpl implements IElectricPowerMarketing {
	//�õ���
	public String electricityChange() {
		String a="�����õ���....";
		System.out.println("�����õ���....");
		return a;
	}
	//�õ籨��
	public String electricityBuild( ) {
		String b="�����õ籨��....";
		System.out.println("�����õ籨��...." );
		return b;
	}
	//�õ�����   
	public String electricityAmplitude() {
		String c="�����õ�����....";
		System.out.println("�����õ�����....");
		return c;
	}
	//����
	public String pay() {
		String d="���츶��..";
		System.out.println("���츶��...");
		return d;
	}
}
