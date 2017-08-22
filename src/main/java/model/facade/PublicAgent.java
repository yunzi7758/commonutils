package model.facade;

/**
 * @author jianghc ������
 */
public class PublicAgent {
	private IElectricPowerMarketing electricPowerMarketing = new ElectricPowerMarketingImpl();

	// ���ŷ�����Ա��Ϊ�¹Ѳм������ṩ�����õ������õ籨�ޡ��õ����ݡ�����ҵ��һ�廯����
	public String sendElectricity() {
		// �����õ���
		electricPowerMarketing.electricityChange();// �õ���
		electricPowerMarketing.electricityBuild();// �õ籨��
		electricPowerMarketing.electricityAmplitude();// �õ�����
		electricPowerMarketing.pay();// ����
		return electricPowerMarketing.electricityChange()
				+ electricPowerMarketing.electricityBuild()
				+ electricPowerMarketing.electricityAmplitude()
				+ electricPowerMarketing.pay();
	}
}
