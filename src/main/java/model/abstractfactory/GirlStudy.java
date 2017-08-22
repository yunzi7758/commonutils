package model.abstractfactory;
//女生学习类
public class GirlStudy implements IStudy {
    public String doStudy() {
    	String a="女生学习";
        System.out.println("女生学习!");
		return a;
    }
}

