package principle.srp2;

public class Jsp2Test {

	public static void main(String[] args) {
		ProductEntity pe = new ProductEntity();
		System.out.println("��Ʒ�Ͳ�ѯ����:1.TCL�ֻ� "+ pe.getName("TCL�ֻ�"));
		ProductService  ps=new  ProductService();
		System.out.println("2.��ѯ "+ ps.selectAll("��ѯ"));
	}
}
