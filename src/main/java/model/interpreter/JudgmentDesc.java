package model.interpreter;

/*
 * AbstractExpression-������ʽ
 */
public interface JudgmentDesc {//����
    public abstract boolean Opinion(Context context);//�ж��߼�
    public abstract JudgmentDesc Swap(String value, JudgmentDesc desc);//����
}