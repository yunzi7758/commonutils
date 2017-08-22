package principle.ocp;

public class PriceCutGirlShoe extends GirlShoe
{

	public PriceCutGirlShoe(String name2, String type2, int value2) 
	{
		super(name2, type2, value2);
	}
    public int getValue()
    {
    	int primeCost=super.getValue();
    	int cutPrice=0;
    	if(primeCost>200)
    	{//如果原价大于200元，则打7.5折
    		cutPrice=cutPrice*75/100;
    		System.out.println("如果原价大于200元，则打7.5折");
    	}
    	if(primeCost>150)
    	{//如果原价大于150元，则打8折	
    		cutPrice=cutPrice*80/100;
    		System.out.println("如果原价大于150元，则打8折");
    	}
    	else//其他，则打8.5折
    	{
    		cutPrice=cutPrice*85/100;
    		System.out.println("其他，则打8.5折");
    	}
    	return primeCost;
    }

}

