package model.templateMethod2;

/**
 *@author jackjiang
 */
public class FirstEdition extends Demo {
	@Override
	public String add() {
		String add="����ҳ������1";
		System.out.println("����ҳ������1");
		return add;
	}
	@Override
	public String del() {
		String del="ɾ��ҳ������1";
		System.out.println("ɾ��ҳ������1");	
		return del;
	}
	@Override
	public String export() {
		String export="����ҳ������1";
		System.out.println("����ҳ������1");	
		return export;
	}
	@Override
	public String leadin() {
		String leadin="����ҳ������1";
		System.out.println("����ҳ������1");	
		return leadin;
	}

	@Override
	public String search() {
		String search="��ѯҳ������1";
		System.out.println("��ѯҳ������1");	
		return  search;
	}
	@Override
	public String update() {
		String update="�޸�ҳ������1";
		System.out.println("�޸�ҳ������1");	
		return update;
	}
}
