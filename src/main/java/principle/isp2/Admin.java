package principle.isp2;

public class Admin implements  ICommodityForAdmin{
	public String GetCommodity(String Commodity) {
		String a = "��ѯ";
		System.out.println("��Adminʵ�ֽӿ�ICommodity�Ĳ�ѯ����");
		return a;
	}
	public String Insert(String Insert) {
		String b = "����";
		System.out.println("��Adminʵ�ֽӿ�ICommodity�Ĳ��뷽��");
		return b;
	}
	public String Update(String Update) {
		String c = "�޸�";
		System.out.println("��Adminʵ�ֽӿ�ICommodity���޸ķ���");
		return c;
	}
	public String Delete(String Delete) {
		String d = "ɾ�� ";
		System.out.println("��Adminʵ�ֽӿ�ICommodity��ɾ������");
		return d;
	}
	}
