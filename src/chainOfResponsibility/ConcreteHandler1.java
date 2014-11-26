package chainOfResponsibility;

public class ConcreteHandler1 extends Handler
{
	public  void handlerRequest(int request)
	{
		if(request >= 0 &&request < 10)
		{
			System.out.println(this.getClass().getName() + "´¦ÀíÇëÇó" + request);
		}
		else if(successor != null)
		{
			successor.handlerRequest(request);
		}
	}

}
