package model.templateMethod2;

/**
 * @author jackjiang
 */
public class SecondEdition extends Demo {
	@Override
	public String add() {
		String add="����ҳ������2";
		System.out.println("����ҳ������2");
		return add;
	}
	@Override
	public String del() {
		String del="ɾ��ҳ������2";
		System.out.println("ɾ��ҳ������2");	
		return del;
	}
	@Override
	public String export() {
		String export="����ҳ������2";
		System.out.println("����ҳ������2");	
		return export;
	}
	@Override
	public String leadin() {
		String leadin="����ҳ������2";
		System.out.println("����ҳ������2");	
		return leadin;
	}
	@Override
	public String search() {
		String search="��ѯҳ������2";
		System.out.println("��ѯҳ������2");	
		return  search;
	}
	@Override
	public String update() {
		String update="�޸�ҳ������2";
		System.out.println("�޸�ҳ������2");	
		return update;
	}
}
