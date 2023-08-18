package Week1.day1;

public class Mobile {
   
	
	public void sendSms() {
	    System.out.println("From OPPO");
	
}	
public long makeCall(long phno) {
	long result = phno;
	System.out.println(result);
	return result;
}
public static void main(String[] args) {
		
		
		
		String colour = "Grey";
		int price = 30000;
		boolean isCharged=true;
		float weight = 6.07f;
		long phno= 123456789l;
		
		System.out.println(colour+6000+isCharged+weight+phno);
		Mobile input=new Mobile();
		input.sendSms();
		input.makeCall(phno);
		
		
		
		
		
	}

}

