package principle.lkp2;

public class LinkMan {   //������
    public void play()
    {   
        System.out.println("introducer ok");   
    }        
    public String playWithSomeGirl() 
    {   
        SomeGirl someGirl = new SomeGirl();   
        String a="aha";
		return someGirl.play(a);   
    }   
}  
