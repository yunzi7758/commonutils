package principle.isp1;

public  class Portal implements ICommodity {
	public String GetCommodity(String Commodity) {
		String a = "xx";
		System.out.println("��Portalʵ�ֽӿ�ICommodity�Ĳ�ѯ����");
		return a;
	}
	//������Portal��˵��Insert\Update\Delete���Ǳ���ģ��������ڽӿ�ICommodity������3��������
	//������ʵ�ֹ����м�ʹ��3�������ķ�����Ϊ�գ�ҲҪ����3��û�����õķ�������ʵ�֡�
	public String Insert(String Insert) {
		String b = "����Ҫ";
		System.out.println("��Portal����Ҫ���뷽��");
		return b;
	}
	public String Update(String Update) {
		String c = "null";
		System.out.println("��Portal����Ҫ�޸ķ���");
		return c;
	}
	public String Delete(String Delete) {
		String d="null";
		System.out.println("��Portal����ҪDelete����");
		return d;
	}
}