package model.bridge;
//Abstraction  ���������Ľӿڣ�ά��һ��ָ��ʵ����(implementor)�ӿ�����(HouseImp)��ָ��
public abstract class House{
    protected HouseImp houseImp;
    public String setHouseImp(HouseImp hi){
    	houseImp=hi;
		return null;
    }
    public abstract String method(String str);
}
