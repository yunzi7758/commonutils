package principle.srp1;

import java.awt.List;

 public class ProductEntity implements IProductEntity{

	public String getName(String Name) {
		 String Name1="手机";
		 System.out.println(Name+"功能性");
		return Name1;
	}

	public String getYearMonth(String YearMonth) {
		 String YearMonth1="报表日期";
		 System.out.println(YearMonth+"年月");
		 return YearMonth1;
	}

	public String getBrand(String Brand ) {
		 String Brand1="品牌";
		 System.out.println(Brand1+"眼镜");
		 return Brand1;
	}

	public String getLocality(String Locality) {
		 String Locality1="产地";
		 System.out.println(Locality1+"产品产地");
		 return Locality1;
	}

	public String getType(String Type) {
		 String Type1="产品类型";
		 System.out.println(Type1+"产品产地");
		 return Type1;
	}

	public int getValue(int Value) {
		int Value1=20;
		 System.out.println(Value1+"价格");
		 return Value1;
	}
	public String selectAll(String all) {
		 String all1="全部查询";
		 System.out.println(all1+"查询");
		return all1;
	}

 }
 
