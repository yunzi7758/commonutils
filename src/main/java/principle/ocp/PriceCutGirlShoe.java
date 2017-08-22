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
    	{//���ԭ�۴���200Ԫ�����7.5��
    		cutPrice=cutPrice*75/100;
    		System.out.println("���ԭ�۴���200Ԫ�����7.5��");
    	}
    	if(primeCost>150)
    	{//���ԭ�۴���150Ԫ�����8��	
    		cutPrice=cutPrice*80/100;
    		System.out.println("���ԭ�۴���150Ԫ�����8��");
    	}
    	else//���������8.5��
    	{
    		cutPrice=cutPrice*85/100;
    		System.out.println("���������8.5��");
    	}
    	return primeCost;
    }

}

