package chainOfResponsibility_raiseSalary;

public abstract class Manager 
{
	public String name;
	//管理者的上级
	public Manager superior;
	
	public Manager(String name)
	{
		this.name = name;
	}
	
	// 设置管理者的上级
	public void setSuperior(Manager superior)
	{
		this.superior = superior;
	}
	
	//申请请求
	public abstract void requestApplications(Request request);

}
