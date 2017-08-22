package principle.srp1;

//单一职责原则应用1
public interface IProductEntity {
	public String getYearMonth(String YearMonth);//生产年月
    public String getName(String Name );//产品名称	
    public String getType(String Type);//产品类型
	public String getBrand(String Brand);//品牌
	public int getValue(int Value);//产品价格
	public String getLocality(String Locality);//  产地
	//////////////////////////////////////////////
    public String selectAll(String all);//查询所有信息
}
