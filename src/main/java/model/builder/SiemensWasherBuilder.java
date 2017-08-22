package model.builder;


/*
 * ���彨���� �����ߣ���ֻ�Ǹı��Լ����ڲ�ʵ��--�������Ӿ�ѹ����������������ѹ������
 */
public class SiemensWasherBuilder implements WasherBuilder {
	
	private SiemensWasher siemensWasher = new SiemensWasher();

	/**
	 * 
	  ��װ���������������š�Ϳ��ɫ��*/
	public void buildeWasherBody() {
		siemensWasher.setWasherDoor("������");
		siemensWasher.setWasherColor("��ɫ");
	}

	/**
	 * ��������װ��ѹ����
	 */
	public void buildeWasherEngine() {
		Compressor audiEngine = new Compressor("����ѹ����");
		siemensWasher.setWasherEngine(audiEngine);
	}

	/**
	 * ����������Ŀ��
	 */
	public void buildeWasherSkeleton() {
		siemensWasher.setWasherSkeleton("������");
	}

	/**
	 * ��������װ������
	 */
	public void buildeWasherWheels() {
		siemensWasher.setWasherWheels("������");
	}
	
	public SiemensWasher retrieveWasher(){
		return siemensWasher;
	}


}
 
