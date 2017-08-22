package principle.ocp;

public class PriceCutMenShoe  extends MenShoe
{
	public PriceCutMenShoe(String name1, String type1, int value1) 
	{
		super(name1, type1, value1);
	}
    public int getValue()
    {
    	int primeCost=super.getValue();
    	int cutPrice=0;
    	if(primeCost>200)
    	{//如果原价大于200元，则打8折
    		cutPrice=cutPrice*80/100;
    	}
    	if(primeCost>150)
    	{//如果原价大于150元，则打8.5折	
    		cutPrice=cutPrice*85/100;
    	}
    	else//其他，则打9折
    	{
    		cutPrice=cutPrice*90/100;
    	}
		return cutPrice;
    }
}
