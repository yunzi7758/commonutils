package model.interpreter;

/*
 * AbstractExpression-抽象表达式
 */
public interface JudgmentDesc {//评判
    public abstract boolean Opinion(Context context);//判断逻辑
    public abstract JudgmentDesc Swap(String value, JudgmentDesc desc);//交换
}