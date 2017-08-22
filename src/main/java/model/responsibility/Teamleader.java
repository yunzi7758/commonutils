package model.responsibility;
//具体处理者(ConcreteHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。
//由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
public  class Teamleader extends Approval {
    public String handleMenuRequest(String person, int menuId) {   
        String str = "";
        //组长只审批50之内的菜单查看权
        if(menuId < 50)
        {
            //充许程序员
            if("程序员".equals(person))
            {
                str = "充许：组长授与(" + person + ")查看菜单内容，菜单编号为" + menuId + " ";    
            }else
            {
                //不充许他人
                str = "不充许：组长不授与(" + person + ")查看菜单内容，菜单编号为" + menuId + " ";
            }
        }else
        {
            //超过50，继续传递给更高层解决 
            if(getPass() != null)
            {
                return getPass().handleMenuRequest(person, menuId);
            }
        }
        return str;
    }
}
