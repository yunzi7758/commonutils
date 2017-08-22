package model.interpreter;



/**
 *    属于 NonterminalExpression 非终结符表达式
 */
public class NoDesc implements JudgmentDesc {
    private JudgmentDesc noDesc;    
    public NoDesc(JudgmentDesc judgmentDesc) {
    	noDesc = judgmentDesc;
    }
    public boolean Opinion(Context context) {//判断逻辑
        return !(noDesc.Opinion(context));
    }
    public JudgmentDesc Swap(String operor, JudgmentDesc desc) {//替换逻辑
        return new NoDesc(noDesc.Swap(operor, desc));
    }
}
