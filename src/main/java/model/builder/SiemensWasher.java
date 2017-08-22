package model.builder;

/*
 * 产品   西门子冰箱(产品)： 
 */
public class SiemensWasher {
	
	private String washerSkeleton;
	private Compressor washerEngine;
	private String washerWheels;
	private String washerDoor;
	private String washerColor;
	public SiemensWasher(){	}
	
	/**
	 * 冰箱的颜色
	 */
	public void setWasherColor(String washerColor) {
		this.washerColor = washerColor;
	}
	/**
	 * 冰箱门
	 */
	public void setWasherDoor(String washerDoor) {
		this.washerDoor = washerDoor;
	}
	/**
	 * 冰箱压缩机，压缩机在这里是一个对象
	 */
	public void setWasherEngine(Compressor washerEngine) {
		this.washerEngine = washerEngine;
	}
	/**
	 * 冰箱的框架
	 */
	public void setWasherSkeleton(String washerSkeleton) {
		this.washerSkeleton = washerSkeleton;
	}
	/**
	 * 冰箱轮子
	 */
	public void setWasherWheels(String washerWheels) {
		this.washerWheels =washerWheels;
	}
	/**
	 * 一个冰箱对象的描述
	 */
	public String toString(){
		return washerSkeleton+ "," + washerEngine.toString() +"," + washerWheels + "," +
		washerDoor + "," + washerColor  ;			
	}
}
