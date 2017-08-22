package model.abstractfactory;
//ÄĞÉú×¬Ç®Àà
public class ManMakeMoney implements IMakeMoney {
    public String doMakeMoney() {
    	String man="ÄĞÉú×¬Ç®";
        System.out.println("ÄĞÉú×¬Ç®!");
        return man;
    }
}
