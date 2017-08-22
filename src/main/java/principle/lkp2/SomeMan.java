package principle.lkp2;

public class SomeMan {   //Ä³ÄÐÐÔµ³Ô±
    private LinkMan linkMan;   
	    public LinkMan getLinkMan() 
	    {   
	        return linkMan;   
	    }   
	    public void setLinkMan(LinkMan linkMan) 
	    {   
	        this.linkMan = linkMan;   
	    }   
	    public void play(LinkMan linkMan)
	    {   
        System.out.println("someman ok");   
        linkMan.play();   
	    }   
}  

