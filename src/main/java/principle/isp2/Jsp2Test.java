package principle.isp2;

public class Jsp2Test {

	public static void main(String[] args) {
		
		Portal b=new Portal();
		System.out.println("��Portal�ķ�����"+b.GetCommodity(""));
		
		Admin d=new Admin();
		System.out.println("��Admin�ķ���: " +d.GetCommodity(""));
		System.out.println(", " +d.Insert(""));
		System.out.println(", " +d.Update(""));	
		System.out.println(", " +d.Delete(""));
	}
}
