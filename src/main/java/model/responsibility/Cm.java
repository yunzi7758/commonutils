package model.responsibility;
//���崦����(ConcreteHandler)��ɫ�����崦���߽ӵ�����󣬿���ѡ��������������߽����󴫸��¼ҡ�
//���ھ��崦���߳��ж��¼ҵ����ã���ˣ������Ҫ�����崦���߿��Է����¼ҡ�
public class Cm extends Approval {
    public String handleMenuRequest(String person, int menuId) {  
        String str = "";
        //���ù���Ա����鿴30���ڵĲ˵�
        if(menuId < 30)
        {
            //ֻ�������Ա
            if("����Ա".equals(person))
            {
                str = "�������ù���Ա����(" + person + ")�鿴�˵����ݣ��˵����Ϊ" + menuId + "";    
            }else
            {
                //������������
                str = "���������ù���Ա������(" + person + ")�鿴�˵����ݣ��˵����Ϊ" + menuId + "";
            }
        }else
        {
            //����30��������һ������
            if(getPass() != null)
            {
                return getPass().handleMenuRequest(person, menuId);
            }
        }
        return str;
    }
}
