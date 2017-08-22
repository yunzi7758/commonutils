package model.responsibility;
//approval ���� ��������(Handler)��ɫ
public abstract class Approval {
    /**
     *ӵ�д����������һ������
     */
    protected Approval pass = null;
    /**
     * ȡֵ����
     */
    public Approval getPass() {
        return pass;
    }
    /**
     *  Ϊ��һ����������Ķ����������   
     */
    public void setPass(Approval pass) {
        this.pass = pass;
    }
    /**
     * ����˵��鿴������
     * @param person    ������
     * @param workId   �˵����
     * @return        ����򲻳�������
     */
    public abstract String handleMenuRequest(String person , int menuId);
}
