package model.interpreter;
/**
 *  属于 NonterminalExpression 非终结符表达式
 */
public class OrDesc implements JudgmentDesc {
    private JudgmentDesc property1;
    private JudgmentDesc property2;
    public OrDesc(JudgmentDesc judgment1, JudgmentDesc judgment2) {
    	property1 = judgment1;
    	property2 = judgment2;
    }
    public boolean Opinion(Context context) {//判断逻辑
        return property1.Opinion(context) ||
        property2.Opinion(context);
    }
    public JudgmentDesc Swap(String operor, JudgmentDesc desc) {//替换逻辑
        return new OrDesc(
        		property1.Swap(operor, desc),
        		property2.Swap(operor, desc)
                    );
    }
}