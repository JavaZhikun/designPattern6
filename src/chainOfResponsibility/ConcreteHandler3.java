package chainOfResponsibility;

public class ConcreteHandler3 extends Handler
{
	public void handlerRequest(int request)
	{
		if(request >= 20 && request < 500)
		{
			System.out.println(this.getClass().getName() + "´¦ÀíÇëÇó" + request);
		}
		else if(successor != null)
		{
			successor.handlerRequest(request);
		}
	}	

}
