package principle.ocp;

public class MenShoe implements IShoe
{
		  private String name;//男鞋名
		  private String type;//男鞋类
		  private int value;//男鞋价格
		public  MenShoe(String name1,String type1,int value1)
		{
		   this.name = name1;
           this.type = type1;
           this.value = value1;
		}
		public String getName() {
			return this.name;
		}
		public String getType() {
			return this.type;
		}
		public int getValue() {
			return this.value;
		}
}
