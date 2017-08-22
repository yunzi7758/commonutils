package principle.srp2;

public class ProductService implements IProductService{
	public String selectAll(String all) {
		 String all1="全部查询";
		 System.out.println(all1+"查询");
		return all1;
	}
}
