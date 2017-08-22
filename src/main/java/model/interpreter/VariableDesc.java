package model.interpreter;
/**
 * TerminalExpression(�ս�����ʽ)
 */
import java.util.*;

public class VariableDesc implements JudgmentDesc {
    private String value;
    public VariableDesc(String _value) {
    	value = _value;
    }
    public boolean Opinion(Context context) {
        return context.Search(value);
    }
    public JudgmentDesc Copy() {
        return new VariableDesc(value);
    }
    public JudgmentDesc Swap(String operor, JudgmentDesc desc) {
        if(operor.equals(value)) {
            return new VariableDesc(value);
        }
		return desc;
    }
}