package model.memento2;

//����¼��ɫ   processor  ���ݴ����
public class Processor implements Processorjudge{   
    private String state;   
       
    public Processor(String state){   
        this.state = state;   
    }   
       
    public String getState(){   
        return this.state;   
    }   
       
    public String setState(String state){   
        return this.state = state;   
    }   
}   

