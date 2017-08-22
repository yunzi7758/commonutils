package model.bridge;
//RefinedAbstraction(ExtensionHouse)：扩充由Abstraction定义的接口。
public class ExtensionHouse extends House{
    public String method(String strExtension){
       String e=strExtension+"\nEXTENSION HOUSE";
       return this.houseImp.doShow(e);
    }
}
