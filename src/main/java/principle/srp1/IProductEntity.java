package principle.srp1;

//��һְ��ԭ��Ӧ��1
public interface IProductEntity {
	public String getYearMonth(String YearMonth);//��������
    public String getName(String Name );//��Ʒ����	
    public String getType(String Type);//��Ʒ����
	public String getBrand(String Brand);//Ʒ��
	public int getValue(int Value);//��Ʒ�۸�
	public String getLocality(String Locality);//  ����
	//////////////////////////////////////////////
    public String selectAll(String all);//��ѯ������Ϣ
}
