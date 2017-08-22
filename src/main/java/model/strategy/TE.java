
package model.strategy;

/**
 * @author jackjiang
 */
public class TE implements IForecastStategy {
	public String work() {
		String TE="趋势外推法：根据过去和现在的发展趋势推断未来的一类方法的总称!";
		System.out.println("趋势外推法：根据过去和现在的发展趋势推断未来的一类方法的总称!");
		return TE;
	}
}
