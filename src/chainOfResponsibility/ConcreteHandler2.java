package chainOfResponsibility;

public class ConcreteHandler2 extends Handler
{
	public void handlerRequest(int request)
	{
		if(request >= 10 && request < 20)
		{
			System.out.println(this.getClass().getName() + "´¦ÀíÇëÇó" + request);
		}
		else if(successor != null)
		{
			successor.handlerRequest(request);
		}
	}	

}
