package model.decorator2;

/*
 @author jianghc  
    Decorator  �� ά��һ��ָ��Component�����ָ�룬������һ���� Component�ӿ�һ�µĽӿڡ� 
    װ���࣬װ�ο��˱��档
 */
public abstract class Decorator extends ExamineeRecord{
	//  ���˱���
	private ExamineeRecord er;
	// ���ڴ��Ϳ��˱���Ĺ��캯��
	public Decorator(ExamineeRecord er){
		this.er = er;
	}
	// ��ʾ���˱���
	public String record(){
		return this.er.record();
	}
	// ������ǩ��
	public String signature(String name){
		return	this.er.signature(name);
	}
	
}
