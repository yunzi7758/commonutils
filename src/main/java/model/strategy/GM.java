
package model.strategy;

/**
 * @author jackjiang
 */
public class GM implements IForecastStategy {
	public String work() {
	String ES="灰色模型:将已知的数据序列按照某种规则构成动态或非动态的白色模块，再按照某种变化、解法来求解未来的数据。";
	System.out.println("灰色模型:将已知的数据序列按照某种规则构成动态或非动态的白色模块，再按照某种变化、解法来求解未来的数据。");
	return ES;
	}
}
