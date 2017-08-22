package model.facade;

/**
 * @author jianghc
 *///用电变更、用电报修、用电增容、付费业务
public class ElectricPowerMarketingImpl implements IElectricPowerMarketing {
	//用电变更
	public String electricityChange() {
		String a="代办用电变更....";
		System.out.println("代办用电变更....");
		return a;
	}
	//用电报修
	public String electricityBuild( ) {
		String b="代办用电报修....";
		System.out.println("代办用电报修...." );
		return b;
	}
	//用电增容   
	public String electricityAmplitude() {
		String c="代办用电增容....";
		System.out.println("代办用电增容....");
		return c;
	}
	//付费
	public String pay() {
		String d="代办付费..";
		System.out.println("代办付费...");
		return d;
	}
}
