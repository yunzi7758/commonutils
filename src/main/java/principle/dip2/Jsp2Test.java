package principle.dip2;

public class Jsp2Test {

	public static void main(String[] args) {
		IEmployee employee = new Code();
		ICode code = new SeniorProgrammer();
		ICode code1 = new CommonProgrammer();
		//�߼�����Ա������ʼ����
		System.out.println(""+employee.code(code));
		//��ͨ����Ա���Ŀ�ʼ����
		System.out.println("������Ա�����ɸ߼�����Ա����:"+employee.code(code1) );
	}
}
