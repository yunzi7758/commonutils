
package model.strategy;

/**
 * @author jackjiang
 */
public class Context {
	// 构造函数，选择所需预测策略
	private IForecastStategy straegy;
	public Context(IForecastStategy forecastStategy) {
		this.straegy = forecastStategy;
	}
	// 运用预测策略，开始。
	public String work() {
		return	this.straegy.work();
	}
}
