package model.proxy;
/**  抽象主题
 * @author jackjiang
 */
public interface ITraining {
	//进入培训讲座会议室
	public String meeting(String employee,String team);
    //参与培训
	public String joinTraining();
   //参与考试
	public String joinExam();
}
