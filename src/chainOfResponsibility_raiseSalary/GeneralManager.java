package chainOfResponsibility_raiseSalary;
//�ܾ���
public class GeneralManager extends Manager
{
	public GeneralManager(String name)
	{
		super(name);
	}
	
	@Override
	public void requestApplications(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() =="���")
		{
			System.out.println(name +":" + request.getRequestContent() +"����"
					           + request.number +"����׼");  
		}
		else if(request.getRequestType() =="��н" && request.number <= 500)
		{
			System.out.println(name +":" + request.getRequestContent() +"����"
					           + request.number +"����׼");
		}
		else if(request.getRequestType() =="��н" && request.number <= 500)
		{
			System.out.println(name +":" + request.getRequestContent() +"����"
			           + request.number +"��˵��");
		}
	}

}
