package command_looseCoupling;

public class Client 
{
	public static void main(String[] args) {
		//����ǰ��׼��
		Barbecuer boy = new Barbecuer();//����ʦ
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		//����Ӫҵ
		girl.setOrder(bakeMuttonCommand1);
		girl.inform();
		girl.setOrder(bakeMuttonCommand2);
		girl.inform();
		girl.setOrder(bakeChickenWingCommand1);
		girl.inform();
		
		
	}

}
