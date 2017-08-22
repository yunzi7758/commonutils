package model.builder;

/*
 * ��Ʒ   �����ӱ���(��Ʒ)�� 
 */
public class SiemensWasher {
	
	private String washerSkeleton;
	private Compressor washerEngine;
	private String washerWheels;
	private String washerDoor;
	private String washerColor;
	public SiemensWasher(){	}
	
	/**
	 * �������ɫ
	 */
	public void setWasherColor(String washerColor) {
		this.washerColor = washerColor;
	}
	/**
	 * ������
	 */
	public void setWasherDoor(String washerDoor) {
		this.washerDoor = washerDoor;
	}
	/**
	 * ����ѹ������ѹ������������һ������
	 */
	public void setWasherEngine(Compressor washerEngine) {
		this.washerEngine = washerEngine;
	}
	/**
	 * ����Ŀ��
	 */
	public void setWasherSkeleton(String washerSkeleton) {
		this.washerSkeleton = washerSkeleton;
	}
	/**
	 * ��������
	 */
	public void setWasherWheels(String washerWheels) {
		this.washerWheels =washerWheels;
	}
	/**
	 * һ��������������
	 */
	public String toString(){
		return washerSkeleton+ "," + washerEngine.toString() +"," + washerWheels + "," +
		washerDoor + "," + washerColor  ;			
	}
}
