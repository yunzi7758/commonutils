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
    	{//���ԭ�۴���200Ԫ�����8��
    		cutPrice=cutPrice*80/100;
    	}
    	if(primeCost>150)
    	{//���ԭ�۴���150Ԫ�����8.5��	
    		cutPrice=cutPrice*85/100;
    	}
    	else//���������9��
    	{
    		cutPrice=cutPrice*90/100;
    	}
		return cutPrice;
    }
}
