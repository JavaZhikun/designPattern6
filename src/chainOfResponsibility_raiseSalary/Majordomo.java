package chainOfResponsibility_raiseSalary;


//�ܼ�
public class Majordomo extends Manager
{
	public Majordomo(String name)
	{
		super(name);
	}
	
	@Override
	public void requestApplications(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() == "���"  && request.number <= 5)
		{
			System.out.println(name + ":" + request.getRequestContent() +"����"
					           + request.number +"����׼");
		}else
	    {
	    	if(superior !=null)
	    	{
			    superior.requestApplications(request);
		    }
	    }
	}

}
