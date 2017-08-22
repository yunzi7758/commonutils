package model.builder;


/*
 * 具体建造者 建造者：（只是改变自己的内部实现--把西门子旧压缩机换成西门子新压缩机）
 */
public class SiemensWasherBuilder implements WasherBuilder {
	
	private SiemensWasher siemensWasher = new SiemensWasher();

	/**
	 * 
	  安装冰箱身（包含冰箱门、涂颜色）*/
	public void buildeWasherBody() {
		siemensWasher.setWasherDoor("冰箱门");
		siemensWasher.setWasherColor("银色");
	}

	/**
	 * 给汽冰箱装上压缩机
	 */
	public void buildeWasherEngine() {
		Compressor audiEngine = new Compressor("新型压缩机");
		siemensWasher.setWasherEngine(audiEngine);
	}

	/**
	 * 建造汽冰箱的框架
	 */
	public void buildeWasherSkeleton() {
		siemensWasher.setWasherSkeleton("冰箱框架");
	}

	/**
	 * 给汽冰箱装上轮子
	 */
	public void buildeWasherWheels() {
		siemensWasher.setWasherWheels("冰箱轮");
	}
	
	public SiemensWasher retrieveWasher(){
		return siemensWasher;
	}


}
 
