package principle.lkp1;

public class SucceedRun {   //成功完成任务
    public static void main(String[] args) 
    {   
        SomeMan jack = new SomeMan();   
        jack.setLinkMan(new LinkMan());   
        jack.getLinkMan().playWithSomeGirl();   
    }   
}  
