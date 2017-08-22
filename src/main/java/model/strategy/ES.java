
package model.strategy;

/**
 * @author jackjiang
 */
public class ES implements IForecastStategy {
	public String work() {
	String ES="指数平滑法：以某种指标的本期实际数和本期预测数为基础，引入一个简化的加权因子，即平滑系数，以求得平均数！";
	System.out.println("指数平滑法：以某种指标的本期实际数和本期预测数为基础，引入一个简化的加权因子，即平滑系数，以求得平均数！");
	return ES;
	}
}
