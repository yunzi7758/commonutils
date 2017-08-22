package model.observer;

public class Book extends BookSubject {
	// 构造器
	private Book() {
	}

	// 构造器
	public Book(double value) {
		this.value = value;
	}

	// 书籍价格
	private double value;

	// 变更书籍价格
	public String updatePrice(double price) {
		 String b=String.valueOf(price);
		if (this.value != price) {
			this.value = price;
			setShift();
		}
		 informObservers();
		return b;
	}

	public double getPrice() {
		return value;
	}

	public void setPrice(double value) {
		this.value = value;
	}
}
