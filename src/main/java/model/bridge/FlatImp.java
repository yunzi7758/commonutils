package model.bridge;
//ConcreteImplementor(FlatImp)：实现ImageImp并定义它的具体实现。-公寓
public class FlatImp implements HouseImp{
    public String doShow(String strFlat){
    	String a="房子属于 公寓!";
       System.out.println(strFlat+" 房子属于 公寓!");
	return a;
    }
}

