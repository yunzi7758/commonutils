package model.observer;
/**
 * �۲���ģʽ
 * ��һ���£������߹۲쵽�¼��ķ���
 * 
 * ͨ��ע������������ģʽ����ʵ��
 * @author Administrator
 *
 */
public class Jsp2Test {

	public static void main(String[] args) {
		//����ԭ��100Ԫ
		Book book = new Book(100);
		System.out.println("ͨ��EMAIL���͸���������ע���û�:"+String.valueOf(new EmailObserver(book)));//���� observer
		
		System.out.println("JAVA���˼��۸��Ϊ:"+String.valueOf(book.updatePrice(85)+"Ԫ")); //���Ӳ�Ʒ�۸� 

		  	
		
	}
}
