package model.builder;

public interface WasherBuilder {
	
	/**
	 * 建造冰箱的框架  抽象建造者：
	 */
	public void buildeWasherSkeleton();
	
	/**
	 * 给冰箱装上发动机
	 */
	public void buildeWasherEngine();
	
	/**
	 * 给冰箱装上轮子
	 */
	public void buildeWasherWheels();
	
	/**
	 * 安装车身（包含车门、车窗的安装，涂颜色）
	 */
	public void buildeWasherBody();

}

