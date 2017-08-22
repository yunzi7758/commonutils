package model.iterator;

/**
 * @author jianghch
 * ����һ���ӿڣ����еĳɱ�����һ���ӿ�- �ۺ�(Aggregate��ʹ�ýӿڻ������)
 */
public interface ICost {
	//������Ŀ
	public void add(String name,int num,int cost);
	//С�Ų鿴�ɱ���Ϣ
	public String getProjectInfo();	
	//ȡ��һ���ɱ���������
	public ICostIterator iterator();
}
