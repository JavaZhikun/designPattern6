package chainOfResponsibility_raiseSalary;

public class Client 
{
	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("金利");
		Majordomo zongjian = new Majordomo("宗剑");
		GeneralManager zhongjingli = new GeneralManager("钟精励");
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zhongjingli);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.number = 1;
		jinli.requestApplications(request);
		
		Request request2 = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.number = 4;
		jinli.requestApplications(request2);
		
		Request request3 = new Request();
		request.setRequestType("加薪");
		request.setRequestContent("小菜请求加薪");
		request.number = 500;
		jinli.requestApplications(request3);
		
		Request request4 = new Request();
		request.setRequestType("加薪");
		request.setRequestContent("小菜请求加薪");
		request.number = 1000;
		jinli.requestApplications(request4);
		
		
	}

}
