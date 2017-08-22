package model.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class BookSubject {
	  //状态
	  private boolean shift = false;

	  //观察者集合
	  private List<Observer> observers;

	  public BookSubject() {
	    observers = new ArrayList<Observer>(0);
	  }

	  //添加一个观察者
	  public synchronized void appendObserver(Observer observer) {
	    if (observer == null)
	      throw new NullPointerException();
	    if (!observers.contains(observer)) {
	      observers.add(observer);
	    }
	  }
	 
	  //删除一个观察者
	  public synchronized void delObserver(Observer observer) {
	    observers.remove(observer);
	  }

	  //通知观察者
	  public void informObservers() {
	    informObservers(null);
	  }

	  //触发连接到这个对象的所有观察者
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

	  //清除观察名单，该对象不再有任何观察员。
	  public synchronized void deleteObservers() {
	    observers.clear();
	  }

	  //标志着观察对象为已更改
	  protected synchronized void setShift() {
		  shift = true;
	  }

	  //说明此对象已不再改变，或者它已通知其所有观察者的最新变化
	  protected synchronized void clearShift() {
		  shift = false;
	  }

	  public synchronized boolean hasShift() {
	    return shift;
	  }

	  public synchronized int countingObservers() {//统计观察者
	    return observers.size();
	  }
	}


