package dependency;

public class EmailNotification implements CustomerNotificationService {
	
	public EmailNotification(){
		System.out.println("");
	}
	
	@Override
	public void alertCustomer(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Email notification :   ");
		System.out.println(msg);
		
	}

}
