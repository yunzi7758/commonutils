package model.bridge;
//RefinedAbstraction(ExtensionHouse)��������Abstraction����Ľӿڡ�
public class ExtensionHouse extends House{
    public String method(String strExtension){
       String e=strExtension+"\nEXTENSION HOUSE";
       return this.houseImp.doShow(e);
    }
}
