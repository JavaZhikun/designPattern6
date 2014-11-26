package command_optimize;

public class Client 
{
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWing = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		//����Ӫҵ���˿͵��
		girl.setOrders(bakeMuttonCommand1);
		girl.setOrders(bakeMuttonCommand2);
		girl.setOrders(bakeChickenWing);
		girl.CancelOrders(bakeMuttonCommand2);
		girl.inform();
		
	}

}
