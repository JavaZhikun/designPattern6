package command_optimize;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter 
{
	//���Ӵ�ž������������
	public List<Command> orders = new ArrayList<Command>();

	//���ö���
	public void setOrders(Command command)
	{
		if(command.toString() =="command_optimize.BakeChickenWingCommand")
		{
			System.out.println("����Ա������û���ˣ�������տ�");
		}
		else
		{
			//��¼�ͻ�������տ�����־���Ա�������Ǯ
			orders.add(command);
			System.out.println("���Ӷ�����" + command.toString()
					           + "ʱ�䣺" + (new Date()).toLocaleString());
		}
	}
	
	//ȡ������
	public void CancelOrders(Command command)
	{
		orders.remove(command);
		System.out.println("ȡ������:" + command.toString()
				          + "ʱ�䣺" + (new Date()).toLocaleString());
		
	}
	
	//֪ͨȫ��ִ��
	public void inform()
	{
		for(Command cmd :orders)
		{
			cmd.excuteCommand();
		}
	}
}
