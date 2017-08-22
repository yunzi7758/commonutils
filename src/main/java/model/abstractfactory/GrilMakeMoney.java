package model.abstractfactory;
//女生赚钱类
public class GrilMakeMoney implements IMakeMoney {
    public String doMakeMoney() {
    	String girl="女生赚钱";
        System.out.println("女生赚钱!");
        return girl;
    }
}

