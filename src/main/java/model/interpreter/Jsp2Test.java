package model.interpreter;

public class Jsp2Test {

	public static void main(String[] args) {
		Context context = new Context();
		VariableDesc vd1 = new VariableDesc("X");
		VariableDesc vd2 = new VariableDesc("Y");
		VariableDesc vdTure = new VariableDesc("true");
		VariableDesc vdFalse = new VariableDesc("false");
		context.Opinion("true", true);
		context.Opinion("false", false);
		context.Opinion("X", false);
		context.Opinion("Y", true);
		//----AND ���ʽ----
		JudgmentDesc description1 = new AndDesc(
		    new AndDesc(vdTure, vd2),
		    new AndDesc(vd2, new NoDesc(vd1))
		);
		boolean outcome1 = description1.Opinion(context);
		//System.out.println("���: AND ���߼�Ϊ " + outcome1);

		System.out.println("���: AND ���߼�Ϊ " + outcome1);	
		//----Or ���ʽ----
		JudgmentDesc description2 = new OrDesc(
				   new OrDesc(vdTure, vd1),
				   new OrDesc(vd2, new NoDesc(vd1))
				);
				boolean outcome2 = description2.Opinion(context);
				//System.out.println("���: OR ���߼�Ϊ" + outcome2);
				//------------------
				System.out.println("���: OR ���߼�Ϊ" + outcome2);	
		 
		  
	}
}
