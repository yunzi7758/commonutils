package principle.srp1;

public class ProductService implements IProductEntity {
	public String selectAll(String all) {
		String all1 = "全部查询";
		System.out.println(all1 + "查询");
		return all1;
	}

	public String getBrand(String Brand) {
		return null;
	}

	public String getLocality(String Locality) {
		return null;
	}

	public String getName(String Name) {
		return null;
	}

	public String getType(String Type) {
		return null;
	}

	public int getValue(int Value) {
		return 0;
	}

	public String getYearMonth(String YearMonth) {
		return null;
	}
}
