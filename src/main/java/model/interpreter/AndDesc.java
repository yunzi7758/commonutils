package model.interpreter;
/**
 *  ���� NonterminalExpression ���ս�����ʽ
 */
public class AndDesc implements JudgmentDesc {
    private JudgmentDesc property1;//����1
    private JudgmentDesc property2;//����2
    public AndDesc(JudgmentDesc desc1, JudgmentDesc desc2) {
    	property1 = desc1;
    	property2 = desc2;
    }
    public boolean Opinion(Context context) {//���
        return property1.Opinion(context) &&
        property2.Opinion(context);
    }
    public JudgmentDesc Swap(String value, JudgmentDesc desc) {//����
        return new AndDesc(
        		property1.Swap(value, desc),
        		property2.Swap(value, desc)
                    );
    }
}