package principle.srp1;

public class Jsp2Test {

	public static void main(String[] args) {
		ProductEntity  productEntity=new ProductEntity();
		System.out.println("��Ʒ����: 1.TCL"+productEntity.getName("TCL"));
		System.out.println("2.����"+productEntity.getName("����"));
		System.out.println("3.��Ϊ"+productEntity.getName("��Ϊ"));
	}
}
