package model.iterator;

import java.util.ArrayList;

/**
 * @author jianghc   
 * �ɱ���Ϣ��--����ۺ�(ConcreteAggregate)
 */
public class Cost implements ICost {
	//����һ���ɱ��б�
	private ArrayList<ICost> costList = new ArrayList<ICost>();
	//�ɱ�����
	private String content = "";
	//Ա������
	private int num = 0;
	//����
	private int charge = 0;
	public Cost(){
	
	}
	//����һ�����캯�����������ϰ���Ҫ��������Ϣ�洢����
	private Cost(String content,int num,int charge){
		//��ֵ����ĳ�Ա������
		this.content = content;
		this.num = num;
		this.charge=charge;
	}
	//������Ŀ
	public void add(String content,int num,int charge){
		this.costList.add(new Cost(content,num,charge));
	}
	//�õ���Ŀ����Ϣ
	public String getProjectInfo() {
		String info = "";
		//�ɱ�����
		info = info+ "�ɱ����ƣ�" + this.content;
		//�����ɱ���
		info = info + "\t�����ɱ�: "+ this.num;
		//����
		info = info+ "\t ���ã�"+ this.charge;
		return info;
	}
	//����һ����������
	public ICostIterator iterator(){
		return new CostIterator(this.costList);
	}

}
