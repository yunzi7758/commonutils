package model.responsibility;
//���崦����(ConcreteHandler)��ɫ�����崦���߽ӵ�����󣬿���ѡ��������������߽����󴫸��¼ҡ�
//���ھ��崦���߳��ж��¼ҵ����ã���ˣ������Ҫ�����崦���߿��Է����¼ҡ�
public class BusinessManager extends Approval {
    public String handleMenuRequest(String person, int menuId) {      
        String str = "";
        //ҵ��������>=50��ŵĲ˵�
        if(menuId >= 50)
        {
            //ֻ�������Ա
            if("����Ա".equals(person))
            {
                str = "����ҵ��������(" + person + ")�鿴�˵����ݣ��˵����Ϊ" + menuId + "";    
            }else
            {
                //������������
                str = "������ҵ��������(" + person + ")�鿴�˵����ݣ��˵����Ϊ" + menuId + "";
            }
        }else
        {
            //���к�̴�����󣬼�������
            if(getPass() != null)
            {
                return getPass().handleMenuRequest(person, menuId);
            }
        }
        return str;
    }
}
