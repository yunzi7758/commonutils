package principle.srp2;

	public interface IProductEntity {
		public String getYearMonth(String YearMonth);//生产年月
	    public String getName(String Name );//产品名称	
	    public String getType(String Type);//产品类型
		public String getBrand(String Brand);//品牌
		public int getValue(int Value);//产品价格
		public String getLocality(String Locality);//  产地
}