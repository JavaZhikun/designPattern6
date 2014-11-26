package command_optimize;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter 
{
	//增加存放具体命令的容器
	public List<Command> orders = new ArrayList<Command>();

	//设置订单
	public void setOrders(Command command)
	{
		if(command.toString() =="command_optimize.BakeChickenWingCommand")
		{
			System.out.println("服务员：鸡翅没有了，请点别的烧烤");
		}
		else
		{
			//记录客户所点的烧烤的日志，以备收帐算钱
			orders.add(command);
			System.out.println("增加订单：" + command.toString()
					           + "时间：" + (new Date()).toLocaleString());
		}
	}
	
	//取消订单
	public void CancelOrders(Command command)
	{
		orders.remove(command);
		System.out.println("取消订单:" + command.toString()
				          + "时间：" + (new Date()).toLocaleString());
		
	}
	
	//通知全部执行
	public void inform()
	{
		for(Command cmd :orders)
		{
			cmd.excuteCommand();
		}
	}
}
