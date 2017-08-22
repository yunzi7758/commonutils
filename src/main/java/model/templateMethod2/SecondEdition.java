package model.templateMethod2;

/**
 * @author jackjiang
 */
public class SecondEdition extends Demo {
	@Override
	public String add() {
		String add="新增页面类型2";
		System.out.println("新增页面类型2");
		return add;
	}
	@Override
	public String del() {
		String del="删除页面类型2";
		System.out.println("删除页面类型2");	
		return del;
	}
	@Override
	public String export() {
		String export="导出页面类型2";
		System.out.println("导出页面类型2");	
		return export;
	}
	@Override
	public String leadin() {
		String leadin="导入页面类型2";
		System.out.println("导入页面类型2");	
		return leadin;
	}
	@Override
	public String search() {
		String search="查询页面类型2";
		System.out.println("查询页面类型2");	
		return  search;
	}
	@Override
	public String update() {
		String update="修改页面类型2";
		System.out.println("修改页面类型2");	
		return update;
	}
}
