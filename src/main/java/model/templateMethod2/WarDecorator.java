package model.templateMethod2;

public class WarDecorator extends Decorator{
//war����
	public WarDecorator(Demo demo) {
		super(demo);
	}
	@Override
	public String add() {
		String add="������ҳ�淢��Ϊwar��ʽ";
		super.add();
		System.out.println("������ҳ�淢��Ϊwar��ʽ");
		return add;
	}
	@Override
	public String del() {
		String del="��ɾ��ҳ�淢��Ϊwar��ʽ";
		super.del();
		System.out.println("��ɾ��ҳ�淢��Ϊwar��ʽ");
		return del;
	}
	@Override
	public String export() {
		String export="������ҳ�淢��Ϊwar��ʽ";
		super.export();
		System.out.println("������ҳ�淢��Ϊwar��ʽ");
		return export;
	}
	@Override
	public String leadin() {
		String leadin="������ҳ�淢��Ϊwar��ʽ";
		super.leadin();
		System.out.println("������ҳ�淢��Ϊwar��ʽ");
		return leadin;
	}
	@Override
	public String search() {
		String leadin="����ѯҳ�淢��Ϊwar��ʽ";
		super.leadin();
		System.out.println("����ѯҳ�淢��Ϊwar��ʽ");
		return leadin;
	}
	@Override
	public String update() {
		String leadin="���޸�ҳ�淢��Ϊwar��ʽ";
		super.leadin();
		System.out.println("���޸�ҳ�淢��Ϊwar��ʽ");
		return leadin;
	}
}
