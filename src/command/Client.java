package command;

public class Client 
{
	public static void main(String[] args) 
	{	
	    Receiver r = new Receiver();          //接受者
	    Command c = new ConcreteCommand(r);   //具体命令
	    Invoker i = new Invoker();            //调用者
	
	    i.setCommand(c);                      //调用者设置命令
	    i.excuteCommand();                    //调用者执行命令
	}
}



