package model.observer;

//email�۲���

public class EmailObserver implements Observer {
	 
	  //���ù�����ΪBook�����ʼ����͹۲���
	  public EmailObserver(Book book) {
	    book.appendObserver(this);
	  }

	  public String update(BookSubject book, Object argObj) {
		  String a="JAVA���˼��۸��Ϊ";
		  String b=String.valueOf(((Book)book).getPrice());
		  String c="Ԫ ; ͨ��EMAIL���͸���������ע���û�.";
	    System.out.println("JAVA���˼��۸��Ϊ "
	        + ((Book)book).getPrice()
	        + "Ԫ ; ͨ��EMAIL���͸���������ע���û�.");   
	    return a+b+c;
	  }
	}

