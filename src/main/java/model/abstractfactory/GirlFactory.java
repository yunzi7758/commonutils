package model.abstractfactory;
//女生学习和赚钱工厂类
public class GirlFactory implements IHumanFactory {
    public IStudy getStudy() {
        return new GirlStudy();
    }
	public IMakeMoney getMakeMoney() {
		return new GrilMakeMoney();
	}
}

