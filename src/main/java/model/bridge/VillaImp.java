package model.bridge;
//ConcreteImplementor(VillaImp)��ʵ��ImageImp���������ľ���ʵ�֡�-����
public class VillaImp implements HouseImp{
    public String doShow(String strVilla){
       String v="�������� ����!";
       System.out.println(strVilla+" �������� ����!");
	   return v;
    }
}