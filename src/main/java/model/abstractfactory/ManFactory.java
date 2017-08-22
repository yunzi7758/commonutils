package model.abstractfactory;
//男生学习和赚钱工厂类
public class ManFactory implements IHumanFactory {
    public IStudy getStudy() {
        return new ManStudy();
    }
    public IMakeMoney getMakeMoney() {
        return new ManMakeMoney();
    }
}
