package principle.lsp2;

public class Jsp2Test {

	public static void main(String[] args) {
	
		   SuperLiskov ob=new SuperLiskov(); //(1)  
		    ob=new SubLiskov();  //(2)   
		    ob.a1(); //(5)
		    ob.a2(); //(6)
		    System.out.println("���Ϊ:" +  (ob.a));
		    System.out.println("���Ϊ:" +  (new SubLiskov().a));
	}
}
