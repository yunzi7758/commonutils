package model.interpreter;
/**
 *  属于 NonterminalExpression 非终结符表达式
 */
public class AndDesc implements JudgmentDesc {
    private JudgmentDesc property1;//属性1
    private JudgmentDesc property2;//属性2
    public AndDesc(JudgmentDesc desc1, JudgmentDesc desc2) {
    	property1 = desc1;
    	property2 = desc2;
    }
    public boolean Opinion(Context context) {//意见
        return property1.Opinion(context) &&
        property2.Opinion(context);
    }
    public JudgmentDesc Swap(String value, JudgmentDesc desc) {//交换
        return new AndDesc(
        		property1.Swap(value, desc),
        		property2.Swap(value, desc)
                    );
    }
}