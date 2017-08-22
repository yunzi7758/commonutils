package model.abstractfactory;
//男生学习类
public class ManStudy implements IStudy {
    public String doStudy() {
    	String a="男生学习!";
        System.out.println("男生学习!");
		return a;
    }
}
