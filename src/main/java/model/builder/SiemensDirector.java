package model.builder;

/*
 * 西门子导演者 导演者： 
这里，由导演者指导建造者以一定的方式生产西门子冰箱
 */
public class SiemensDirector {
	WasherBuilder builder;
	/**
	 * 为导演者配置一个建造者
	 */
	public SiemensDirector(WasherBuilder builder){
		this.builder = builder;
	}
	/**
	 * 按照一定的方式或规则建造冰箱
	 */
	public void contruct(){
		builder.buildeWasherSkeleton();
		builder.buildeWasherEngine();
		builder.buildeWasherWheels();
		builder.buildeWasherBody();
	}
}