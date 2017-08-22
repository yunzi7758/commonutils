package model.observer;

//email观察者

public class EmailObserver implements Observer {
	 
	  //运用构造器为Book放置邮件发送观察者
	  public EmailObserver(Book book) {
	    book.appendObserver(this);
	  }

	  public String update(BookSubject book, Object argObj) {
		  String a="JAVA编程思想价格变为";
		  String b=String.valueOf(((Book)book).getPrice());
		  String c="元 ; 通过EMAIL发送给所有邮箱注册用户.";
	    System.out.println("JAVA编程思想价格变为 "
	        + ((Book)book).getPrice()
	        + "元 ; 通过EMAIL发送给所有邮箱注册用户.");   
	    return a+b+c;
	  }
	}

