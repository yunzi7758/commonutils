package model.bridge;
//ConcreteImplementor(VillaImp)：实现ImageImp并定义它的具体实现。-别墅
public class VillaImp implements HouseImp{
    public String doShow(String strVilla){
       String v="房子属于 别墅!";
       System.out.println(strVilla+" 房子属于 别墅!");
	   return v;
    }
}