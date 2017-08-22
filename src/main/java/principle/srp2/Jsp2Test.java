package principle.srp2;

public class Jsp2Test {

	public static void main(String[] args) {
		ProductEntity pe = new ProductEntity();
		System.out.println("产品和查询功能:1.TCL手机 "+ pe.getName("TCL手机"));
		ProductService  ps=new  ProductService();
		System.out.println("2.查询 "+ ps.selectAll("查询"));
	}
}
