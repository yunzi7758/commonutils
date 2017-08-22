
package model.strategy;

/**
 * @author jackjiang
 */
public class Context {
	// ���캯����ѡ������Ԥ�����
	private IForecastStategy straegy;
	public Context(IForecastStategy forecastStategy) {
		this.straegy = forecastStategy;
	}
	// ����Ԥ����ԣ���ʼ��
	public String work() {
		return	this.straegy.work();
	}
}
