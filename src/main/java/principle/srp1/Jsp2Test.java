package principle.srp1;

public class Jsp2Test {

	public static void main(String[] args) {
		ProductEntity  productEntity=new ProductEntity();
		System.out.println("产品名称: 1.TCL"+productEntity.getName("TCL"));
		System.out.println("2.厦新"+productEntity.getName("厦新"));
		System.out.println("3.华为"+productEntity.getName("华为"));
	}
}
