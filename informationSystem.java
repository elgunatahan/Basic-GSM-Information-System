package ndkdönemprojesi;

import java.util.*;

public class informationSystem {

	public static void main(String[] args) {
	
Scanner in =new Scanner(System.in);
    System.out.println("GSM SERVICE PROVIDER?: ");
       String gsName= in.nextLine();
       GSMProvider gsm = new GSMProvider(gsName);
       System.out.println("NUMBER OF SUBSCRIPTION PLANS ?: ");
       int number = in.nextInt();
       in.nextLine();
       for(int i=0;i<number;i++){
    	   
    	   System.out.println("NAME OF THE Plan ?: ");
    	   String plName = in.nextLine();
    	   SubscriptionPlan sp = new SubscriptionPlan(plName);
    	   gsm.addSubscriptionPlan(sp);
       }
       System.out.println("CUSTOMER CITIZENSHIP NUMBER ?: ");
       String csNumber= in.nextLine();
       System.out.println("CUSTOMER NAME ?: ");
       String csName= in.nextLine();
     
       ExistingCustomer ec= new ExistingCustomer(csNumber);
       ec.setName(csName);
       
       
       System.out.println("NAME OF THE PLAN TO BE SUBSCRIBED ?: ");
       String scName= in.nextLine();
       System.out.println("START DATE FOR SUBSCRIPTION (MM/DD/YYYY)?: ");
       String date=in.nextLine();
	Date scstartDate= new Date(date);
	
       
       while(gsm.findSubscriptionPlan(scName)==null){
    	   System.out.println("Girilen paket bulunamadi ");
    	   
           System.out.println("NAME OF THE PLAN TO BE SUBSCRIBED ?: ");
           scName= in.nextLine();
       }
       
    	   Subscription subscription= new Subscription(scstartDate,gsm.findSubscriptionPlan(scName));
    	 
       
       System.out.println("CUSTOMER CITIZENSHIP NUMBER = "+ec.getCitizenshipNr()+"\nCUSTOMER NAME ="+ec.getName()+"\nSERVICE PROVIDER :"+gsm.getName()+"\nSUBSCRIPTION START DATE :"+subscription.getSubscriptionStartDate()+"\nSUBSCRIPTION PLAN NAME :"+subscription.getSubscriptionPlan().getName() );
       
        
       
       
	}

}
