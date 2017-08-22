package model.proxy;

public class Jsp2Test {

	public static void main(String[] args) {
		//定义参会者lidong
		ITraining training = new LidongTraining("李东");
		//然后再定义一个代练者
		ITraining proxy = new ManProxy(training);
		//开始培训，记下时间戳
		System.out.println("开始时间：2011-8-2 13:00");	
		System.out.println(proxy.meeting("lidong", "team"));//参加培训会的人
		System.out.println(proxy.joinTraining());//参加培训
		System.out.println(proxy.joinExam());//考试
		 System.out.println("结束时间：2011-8-2 15:30");
	}
}
