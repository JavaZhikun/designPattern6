package chainOfResponsibility_raiseSalary;

public class CommonManager extends Manager
{
	public CommonManager(String name)
	{
		super(name);
	}
	
	@Override
	public void requestApplications(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() =="请假" && request.number <= 2)
		{
			System.out.println(name+ ":" +request.getRequestContent() + "数量" 
		                       + request.getNumber() + "被批准" );
		}
		else
		{//其余的申请都需转到上级
			if(superior != null)
			{
				superior.requestApplications(request);
			}
		}
	}

}
