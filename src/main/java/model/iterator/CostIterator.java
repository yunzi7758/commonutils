package model.iterator;

import java.util.ArrayList;

/**
 * @author jianghc
 * ����һ��������
 */
public class CostIterator implements ICostIterator {
	//���е���Ŀ����������ArrayList��
	private ArrayList<ICost> costList = new ArrayList<ICost>();
	private int currentItem = 0; 
	//���캯������costList
	public CostIterator(ArrayList<ICost> projectList){
		this.costList = projectList;
	}
	//�ж��Ƿ���Ԫ�أ�����ʵ��
	public boolean hasNext() {
		//����һ������ֵ
		boolean b = true;
		if(this.currentItem>=costList.size() || this.costList.get(this.currentItem) == null){
			b =false;
		}
		return b;
	}
	//ȡ����һ��ֵ
	public ICost next() {
		return (ICost)this.costList.get(this.currentItem++);
	}
	//ɾ��һ������
	public void remove() {
		//��ʱû��ʹ�õ�
	}
}
