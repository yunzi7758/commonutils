package principle.lkp1;

public class SucceedRun {   //�ɹ��������
    public static void main(String[] args) 
    {   
        SomeMan jack = new SomeMan();   
        jack.setLinkMan(new LinkMan());   
        jack.getLinkMan().playWithSomeGirl();   
    }   
}  
