package model.abstractfactory;
//����׬Ǯ��
public class ManMakeMoney implements IMakeMoney {
    public String doMakeMoney() {
    	String man="����׬Ǯ";
        System.out.println("����׬Ǯ!");
        return man;
    }
}
