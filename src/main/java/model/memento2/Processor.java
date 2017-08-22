package model.memento2;

//备忘录角色   processor  数据处理机
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

