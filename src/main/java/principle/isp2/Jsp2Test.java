package principle.isp2;

public class Jsp2Test {

	public static void main(String[] args) {
		
		Portal b=new Portal();
		System.out.println("类Portal的方法："+b.GetCommodity(""));
		
		Admin d=new Admin();
		System.out.println("类Admin的方法: " +d.GetCommodity(""));
		System.out.println(", " +d.Insert(""));
		System.out.println(", " +d.Update(""));	
		System.out.println(", " +d.Delete(""));
	}
}
