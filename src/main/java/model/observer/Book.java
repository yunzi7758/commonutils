package model.observer;

public class Book extends BookSubject {
	// ������
	private Book() {
	}

	// ������
	public Book(double value) {
		this.value = value;
	}

	// �鼮�۸�
	private double value;

	// ����鼮�۸�
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
