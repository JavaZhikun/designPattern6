package chainOfResponsibility_raiseSalary;

public class Request 
{
	public String requestType;   //申请类别
    public String requestContent;//申请内容
    public int number;           //数量

    public String getRequestType()
    {
    	return requestType;
    }
    
    public void setRequestType(String requestType)
    {
    	this.requestType = requestType;
    }
    
    public String getRequestContent()
    {
    	return requestContent;
    }
    
    public void setRequestContent(String requestContent)
    {
    	this.requestContent = requestContent;
    }
    
    public int getNumber()
    {
    	return number;
    }
    
    public void setNumber(int number)
    {
    	this.number = number;
    }
}
