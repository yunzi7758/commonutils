package model.abstractfactory;
//Ů��ѧϰ��׬Ǯ������
public class GirlFactory implements IHumanFactory {
    public IStudy getStudy() {
        return new GirlStudy();
    }
	public IMakeMoney getMakeMoney() {
		return new GrilMakeMoney();
	}
}

