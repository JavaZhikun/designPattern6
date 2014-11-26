package chainOfResponsibility_raiseSalary;
//总经理
public class GeneralManager extends Manager
{
	public GeneralManager(String name)
	{
		super(name);
	}
	
	@Override
	public void requestApplications(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() =="请假")
		{
			System.out.println(name +":" + request.getRequestContent() +"数量"
					           + request.number +"被批准");  
		}
		else if(request.getRequestType() =="加薪" && request.number <= 500)
		{
			System.out.println(name +":" + request.getRequestContent() +"数量"
					           + request.number +"被批准");
		}
		else if(request.getRequestType() =="加薪" && request.number <= 500)
		{
			System.out.println(name +":" + request.getRequestContent() +"数量"
			           + request.number +"再说吧");
		}
	}

}
