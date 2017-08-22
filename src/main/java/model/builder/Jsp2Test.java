package model.builder;

public class Jsp2Test {

	public static void main(String[] args) {
//		创建一个建造者对象
		SiemensWasherBuilder builder = new SiemensWasherBuilder();
//		创建一个导演者，并为它配置一个建造者
		SiemensDirector directorOne = new SiemensDirector(builder);	
//		导演者将通知建造者去创建产品
//		在这个过程中，建造者将会根据导演者的请求，去创建组织并创建产品对象
		directorOne.contruct();		
//		从具体建造者中检索产品（返回的是冰箱的轮子）。
		SiemensWasher siemensWasher = builder.retrieveWasher();	
		
		System.out.println(siemensWasher);
	}
}
