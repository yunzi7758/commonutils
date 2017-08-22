package model.abstractfactory;

public class Jsp2Test {

	public static void main(String[] args) {
		IHumanFactory manStudyFactory = new ManFactory();
		IHumanFactory girlStudyFactory = new GirlFactory();
		IHumanFactory manMakeMoneyFactory = new ManFactory();
		IHumanFactory girlMakeMoneyFactory = new GirlFactory();
		
		System.out.println("manStudyFactory: " + manStudyFactory.getStudy().doStudy());
		System.out.println("girlStudyFactory: " +girlStudyFactory.getStudy().doStudy());
		System.out.println("manMakeMoneyFactory: " +manMakeMoneyFactory.getMakeMoney().doMakeMoney());
		System.out.println("girlMakeMoneyFactory:"+girlMakeMoneyFactory.getMakeMoney().doMakeMoney());

	}
}
