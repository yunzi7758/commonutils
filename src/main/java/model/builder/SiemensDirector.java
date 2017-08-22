package model.builder;

/*
 * �����ӵ����� �����ߣ� 
����ɵ�����ָ����������һ���ķ�ʽ���������ӱ���
 */
public class SiemensDirector {
	WasherBuilder builder;
	/**
	 * Ϊ����������һ��������
	 */
	public SiemensDirector(WasherBuilder builder){
		this.builder = builder;
	}
	/**
	 * ����һ���ķ�ʽ����������
	 */
	public void contruct(){
		builder.buildeWasherSkeleton();
		builder.buildeWasherEngine();
		builder.buildeWasherWheels();
		builder.buildeWasherBody();
	}
}