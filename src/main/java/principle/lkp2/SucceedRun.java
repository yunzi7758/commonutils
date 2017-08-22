package principle.lkp2;

public class SucceedRun {   //完成任务
    public static void main(String[] args) 
    {   
        SomeMan jack = new SomeMan();   
        jack.setLinkMan(new LinkMan());   
        jack.getLinkMan().playWithSomeGirl();   
    }   
}  
