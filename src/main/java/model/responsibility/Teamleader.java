package model.responsibility;
//���崦����(ConcreteHandler)��ɫ�����崦���߽ӵ�����󣬿���ѡ��������������߽����󴫸��¼ҡ�
//���ھ��崦���߳��ж��¼ҵ����ã���ˣ������Ҫ�����崦���߿��Է����¼ҡ�
public  class Teamleader extends Approval {
    public String handleMenuRequest(String person, int menuId) {   
        String str = "";
        //�鳤ֻ����50֮�ڵĲ˵��鿴Ȩ
        if(menuId < 50)
        {
            //�������Ա
            if("����Ա".equals(person))
            {
                str = "�����鳤����(" + person + ")�鿴�˵����ݣ��˵����Ϊ" + menuId + " ";    
            }else
            {
                //����������
                str = "�������鳤������(" + person + ")�鿴�˵����ݣ��˵����Ϊ" + menuId + " ";
            }
        }else
        {
            //����50���������ݸ����߲��� 
            if(getPass() != null)
            {
                return getPass().handleMenuRequest(person, menuId);
            }
        }
        return str;
    }
}
