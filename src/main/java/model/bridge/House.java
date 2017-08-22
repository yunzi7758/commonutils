package model.bridge;
//Abstraction  定义抽象类的接口，维护一个指向实现者(implementor)接口类型(HouseImp)的指针
public abstract class House{
    protected HouseImp houseImp;
    public String setHouseImp(HouseImp hi){
    	houseImp=hi;
		return null;
    }
    public abstract String method(String str);
}
