package model.templateMethod2;

abstract public class Decorator extends Demo{//发布抽象装饰类
	private Demo demo;
	public Decorator(Demo demo){
		super();
		this.demo=demo;
	}
	@Override
	public String add() {
		return demo.add();
	}
	@Override
	public String del() {
		return demo.del();
	}

	@Override
	public String export() {
		return demo.export();
	}
	@Override
	public String leadin() {
		return demo.leadin();
	}
	@Override
	public String search() {
		return demo.search();
	}
	@Override
	public String update() {
		return demo.update();
	}
}
