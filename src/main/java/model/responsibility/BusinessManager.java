package model.responsibility;
//具体处理者(ConcreteHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。
//由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
public class BusinessManager extends Approval {
    public String handleMenuRequest(String person, int menuId) {      
        String str = "";
        //业务经理审批>=50编号的菜单
        if(menuId >= 50)
        {
            //只充许程序员
            if("程序员".equals(person))
            {
                str = "充许：业务经理授与(" + person + ")查看菜单内容，菜单编号为" + menuId + "";    
            }else
            {
                //不充许其他人
                str = "不充许：业务经理不授与(" + person + ")查看菜单内容，菜单编号为" + menuId + "";
            }
        }else
        {
            //如有后继处理对象，继续传递
            if(getPass() != null)
            {
                return getPass().handleMenuRequest(person, menuId);
            }
        }
        return str;
    }
}
