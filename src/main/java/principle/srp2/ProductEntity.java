package principle.srp2;

public class ProductEntity implements IProductEntity{

	public String getName(String Name) {
		 String Name1="�ֻ�";
		 System.out.println(Name+"������");
		return Name1;
	}

	public String getYearMonth(String YearMonth) {
		 String YearMonth1="��������";
		 System.out.println(YearMonth+"����");
		 return YearMonth1;
	}

	public String getBrand(String Brand ) {
		 String Brand1="Ʒ��";
		 System.out.println(Brand1+"�۾�");
		 return Brand1;
	}

	public String getLocality(String Locality) {
		 String Locality1="����";
		 System.out.println(Locality1+"��Ʒ����");
		 return Locality1;
	}

	public String getType(String Type) {
		 String Type1="��Ʒ����";
		 System.out.println(Type1+"��Ʒ����");
		 return Type1;
	}

	public int getValue(int Value) {
		int Value1=20;
		 System.out.println(Value1+"�۸�");
		 return Value1;
	}
}
