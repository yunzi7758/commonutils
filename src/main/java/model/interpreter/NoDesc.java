package model.interpreter;



/**
 *    ���� NonterminalExpression ���ս�����ʽ
 */
public class NoDesc implements JudgmentDesc {
    private JudgmentDesc noDesc;    
    public NoDesc(JudgmentDesc judgmentDesc) {
    	noDesc = judgmentDesc;
    }
    public boolean Opinion(Context context) {//�ж��߼�
        return !(noDesc.Opinion(context));
    }
    public JudgmentDesc Swap(String operor, JudgmentDesc desc) {//�滻�߼�
        return new NoDesc(noDesc.Swap(operor, desc));
    }
}
