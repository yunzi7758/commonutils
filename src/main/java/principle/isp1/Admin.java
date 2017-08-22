package principle.isp1;

public class Admin implements ICommodity {
	public String GetCommodity(String Commodity) {
		String a = "a1";
		System.out.println("类Admin实现接口ICommodity的查询方法");
		return a;
	}

	public String Insert(String Insert) {
		String b = "需要";
		System.out.println("类Admin实现接口ICommodity的插入方法");
		return b;
	}

	public String Update(String Update) {
		String c = "c1";
		System.out.println("类Admin实现接口ICommodity的修改方法");
		return c;
	}

	public String Delete(String Delete) {
		String d = "Delete";
		System.out.println("类Admin实现接口ICommodity的Delete方法");
		return d;
	}

}
