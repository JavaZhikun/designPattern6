package chainOfResponsibility_raiseSalary;

public class Client 
{
	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("����");
		Majordomo zongjian = new Majordomo("�ڽ�");
		GeneralManager zhongjingli = new GeneralManager("�Ӿ���");
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zhongjingli);
		
		Request request = new Request();
		request.setRequestType("���");
		request.setRequestContent("С�����");
		request.number = 1;
		jinli.requestApplications(request);
		
		Request request2 = new Request();
		request.setRequestType("���");
		request.setRequestContent("С�����");
		request.number = 4;
		jinli.requestApplications(request2);
		
		Request request3 = new Request();
		request.setRequestType("��н");
		request.setRequestContent("С�������н");
		request.number = 500;
		jinli.requestApplications(request3);
		
		Request request4 = new Request();
		request.setRequestType("��н");
		request.setRequestContent("С�������н");
		request.number = 1000;
		jinli.requestApplications(request4);
		
		
	}

}
