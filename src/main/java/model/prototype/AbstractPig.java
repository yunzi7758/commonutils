package model.prototype;


/** 
 * ԭ����(����Ϊ��) ,ע��Ҫʵ��Cloneable�ӿ�
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
     * ��дclone()����
     */
    @Override
    public Object clone()
    {
        try
        {
            return super.clone();
        } catch (CloneNotSupportedException e)
        {
            System.out.println("�˶���֧�ָ���");
        }
        return null;
    }
}
