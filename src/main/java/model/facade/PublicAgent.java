package model.facade;

/**
 * @author jianghc 代办人
 */
public class PublicAgent {
	private IElectricPowerMarketing electricPowerMarketing = new ElectricPowerMarketingImpl();

	// 上门服务人员，为孤寡残疾老人提供代办用电变更、用电报修、用电增容、付费业务一体化服务。
	public String sendElectricity() {
		// 代办用电办更
		electricPowerMarketing.electricityChange();// 用电变更
		electricPowerMarketing.electricityBuild();// 用电报修
		electricPowerMarketing.electricityAmplitude();// 用电增容
		electricPowerMarketing.pay();// 付费
		return electricPowerMarketing.electricityChange()
				+ electricPowerMarketing.electricityBuild()
				+ electricPowerMarketing.electricityAmplitude()
				+ electricPowerMarketing.pay();
	}
}
