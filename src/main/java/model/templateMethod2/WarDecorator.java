package model.templateMethod2;

public class WarDecorator extends Decorator{
//war发布
	public WarDecorator(Demo demo) {
		super(demo);
	}
	@Override
	public String add() {
		String add="将新增页面发布为war格式";
		super.add();
		System.out.println("将新增页面发布为war格式");
		return add;
	}
	@Override
	public String del() {
		String del="将删除页面发布为war格式";
		super.del();
		System.out.println("将删除页面发布为war格式");
		return del;
	}
	@Override
	public String export() {
		String export="将导出页面发布为war格式";
		super.export();
		System.out.println("将导出页面发布为war格式");
		return export;
	}
	@Override
	public String leadin() {
		String leadin="将导入页面发布为war格式";
		super.leadin();
		System.out.println("将导入页面发布为war格式");
		return leadin;
	}
	@Override
	public String search() {
		String leadin="将查询页面发布为war格式";
		super.leadin();
		System.out.println("将查询页面发布为war格式");
		return leadin;
	}
	@Override
	public String update() {
		String leadin="将修改页面发布为war格式";
		super.leadin();
		System.out.println("将修改页面发布为war格式");
		return leadin;
	}
}
