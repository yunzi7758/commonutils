package principle.ocp;

public class Jsp2Test {

	public static void main(String[] args) {
		   PriceCutGirlShoe a = new PriceCutGirlShoe("女鞋名", "女鞋类型", 160);
		   System.out.println("鞋价为:" + a.getValue());
	}
}
