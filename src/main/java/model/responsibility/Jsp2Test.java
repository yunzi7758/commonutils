package model.responsibility;
/**
 * ������--��A��һ���£�A��ְ��������½���B��B��ְ��������½���C
 * (������˳��ʱ�̶������ǵ�ְ��ʱ�����)
 * 
 * ͨ����ϼ���ʵ��
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
			
		 
			//��Ҫ��װ������
		 Approval a1 = new BusinessManager();
		 Approval a2 = new Teamleader();
		 Approval a3 = new Cm();
		 a3.setPass(a2);
		 a2.setPass(a1);
		
		 //����
		 String one = a3.handleMenuRequest("����Ա", 29);
		 System.out.println("one = " + one);	
		 //����
		 String two = a3.handleMenuRequest("ҵ��Ա", 29);
		 System.out.println("two = " + two);
		  
		 //����
		 String three = a3.handleMenuRequest("����Ա", 40);
		 System.out.println("three = " + three);
		 //����
		 String four = a3.handleMenuRequest("ҵ��Ա", 40);
		 System. out.println("four = " + four);		
		 //����
		 String five = a3.handleMenuRequest("����Ա", 55);
		 System.out.println("five = " + five);	
		 //����
		 String six = a3.handleMenuRequest("ҵ��Ա", 55);
		 System.out.println("six = " + six);	

	}
}
