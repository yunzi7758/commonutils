package model.interpreter;
/**
 *  ���� NonterminalExpression ���ս�����ʽ
 */
public class OrDesc implements JudgmentDesc {
    private JudgmentDesc property1;
    private JudgmentDesc property2;
    public OrDesc(JudgmentDesc judgment1, JudgmentDesc judgment2) {
    	property1 = judgment1;
    	property2 = judgment2;
    }
    public boolean Opinion(Context context) {//�ж��߼�
        return property1.Opinion(context) ||
        property2.Opinion(context);
    }
    public JudgmentDesc Swap(String operor, JudgmentDesc desc) {//�滻�߼�
        return new OrDesc(
        		property1.Swap(operor, desc),
        		property2.Swap(operor, desc)
                    );
    }
}