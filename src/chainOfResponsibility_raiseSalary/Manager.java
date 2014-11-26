package chainOfResponsibility_raiseSalary;

public abstract class Manager 
{
	public String name;
	//�����ߵ��ϼ�
	public Manager superior;
	
	public Manager(String name)
	{
		this.name = name;
	}
	
	// ���ù����ߵ��ϼ�
	public void setSuperior(Manager superior)
	{
		this.superior = superior;
	}
	
	//��������
	public abstract void requestApplications(Request request);

}
