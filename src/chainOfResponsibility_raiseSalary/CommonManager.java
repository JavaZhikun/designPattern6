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
		if(request.getRequestType() =="���" && request.number <= 2)
		{
			System.out.println(name+ ":" +request.getRequestContent() + "����" 
		                       + request.getNumber() + "����׼" );
		}
		else
		{//��������붼��ת���ϼ�
			if(superior != null)
			{
				superior.requestApplications(request);
			}
		}
	}

}
