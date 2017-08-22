package model.iterator;

public class Jsp2Test {

	public static void main(String[] args) {
		//����һ��List��������е���Ŀ����
		  ICost cost = new Cost();
		  //�ɹ�֧��
		  cost.add("�ɹ�",10,100000);
		  //����֧��
		  cost.add("����",100,10000000);
		  //��˰֧��
		  cost.add("��˰",10000,1000000000);
		  //���30����Ŀ
		  for(int i=4;i<34;i++){
		  	cost.add("��"+i+"��֧��",i*5,i*1000000);
		  }
		  //����һ��ArrayList�������е����ݶ�ȡ��
		  ICostIterator projectIterator = cost.iterator();
		  while(projectIterator.hasNext()){
		  	ICost p = (ICost)projectIterator.next();
		  	System. out.println(p.getProjectInfo());
		  }
		  
	}
}
