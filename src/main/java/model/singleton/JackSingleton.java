package model.singleton;
/*����ʽ������*/
public class JackSingleton
{
	private static final JackSingleton jackSingleton = new JackSingleton();
	private JackSingleton()
	{
	}
	public synchronized static JackSingleton getInstance() 
	{
		return jackSingleton;
	}	
}
