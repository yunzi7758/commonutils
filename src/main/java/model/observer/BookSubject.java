package model.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class BookSubject {
	  //״̬
	  private boolean shift = false;

	  //�۲��߼���
	  private List<Observer> observers;

	  public BookSubject() {
	    observers = new ArrayList<Observer>(0);
	  }

	  //���һ���۲���
	  public synchronized void appendObserver(Observer observer) {
	    if (observer == null)
	      throw new NullPointerException();
	    if (!observers.contains(observer)) {
	      observers.add(observer);
	    }
	  }
	 
	  //ɾ��һ���۲���
	  public synchronized void delObserver(Observer observer) {
	    observers.remove(observer);
	  }

	  //֪ͨ�۲���
	  public void informObservers() {
	    informObservers(null);
	  }

	  //�������ӵ������������й۲���
	  public void informObservers(Object argObj) {
	    synchronized (this) {
	      if (!shift)
	        return;
	      clearShift();
	    }
	   
	    for (Observer observer : observers) {
	      observer.update(this, argObj);
	    }
	  }

	  //����۲��������ö��������κι۲�Ա��
	  public synchronized void deleteObservers() {
	    observers.clear();
	  }

	  //��־�Ź۲����Ϊ�Ѹ���
	  protected synchronized void setShift() {
		  shift = true;
	  }

	  //˵���˶����Ѳ��ٸı䣬��������֪ͨ�����й۲��ߵ����±仯
	  protected synchronized void clearShift() {
		  shift = false;
	  }

	  public synchronized boolean hasShift() {
	    return shift;
	  }

	  public synchronized int countingObservers() {//ͳ�ƹ۲���
	    return observers.size();
	  }
	}


