package chainOfResponsibility_raiseSalary;


//总监
public class Majordomo extends Manager
{
	public Majordomo(String name)
	{
		super(name);
	}
	
	@Override
	public void requestApplications(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() == "请假"  && request.number <= 5)
		{
			System.out.println(name + ":" + request.getRequestContent() +"数量"
					           + request.number +"被批准");
		}else
	    {
	    	if(superior !=null)
	    	{
			    superior.requestApplications(request);
		    }
	    }
	}

}
