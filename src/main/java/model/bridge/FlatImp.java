package model.bridge;
//ConcreteImplementor(FlatImp)��ʵ��ImageImp���������ľ���ʵ�֡�-��Ԣ
public class FlatImp implements HouseImp{
    public String doShow(String strFlat){
    	String a="�������� ��Ԣ!";
       System.out.println(strFlat+" �������� ��Ԣ!");
	return a;
    }
}

