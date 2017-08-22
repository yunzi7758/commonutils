package model.prototype;


/** 
 * 原型类(以猪为例) ,注意要实现Cloneable接口
 * 
 * @author jackjiang
 * 
 */
public abstract class AbstractPig implements Cloneable
{
    public String pigName;

    public String getPigName()
    {
        return this.pigName;
    }

    public void setPigName(String pigName)
    {
        this.pigName = pigName;
    }

    /** *//**
     * 重写clone()方法
     */
    @Override
    public Object clone()
    {
        try
        {
            return super.clone();
        } catch (CloneNotSupportedException e)
        {
            System.out.println("此对象不支持复制");
        }
        return null;
    }
}
