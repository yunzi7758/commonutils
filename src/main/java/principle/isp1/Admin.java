package principle.isp1;

public class Admin implements ICommodity {
	public String GetCommodity(String Commodity) {
		String a = "a1";
		System.out.println("��Adminʵ�ֽӿ�ICommodity�Ĳ�ѯ����");
		return a;
	}

	public String Insert(String Insert) {
		String b = "��Ҫ";
		System.out.println("��Adminʵ�ֽӿ�ICommodity�Ĳ��뷽��");
		return b;
	}

	public String Update(String Update) {
		String c = "c1";
		System.out.println("��Adminʵ�ֽӿ�ICommodity���޸ķ���");
		return c;
	}

	public String Delete(String Delete) {
		String d = "Delete";
		System.out.println("��Adminʵ�ֽӿ�ICommodity��Delete����");
		return d;
	}

}
