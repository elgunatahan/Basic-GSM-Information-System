package ndkdönemprojesi;

public class Cableprovider implements ServiceProvider {
	 
    private int Count,MaxCount ;
	private String name;
    private SubscriptionPlan[] subscriptionPlans;
    
	public Cableprovider(String name) {
		super();
		this.name = name;
        Count = 0;
        MaxCount=100;
        subscriptionPlans =new SubscriptionPlan[MaxCount];
	}

	
	public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		if(Count<subscriptionPlans.length){
			subscriptionPlans[Count]=subscriptionPlan;
		}
		
	}
	
	public void findSubscriptionPlan(String name) {
		for(int i = 0;i<Count;i++){
			if(this.subscriptionPlans[i].getName()==name){
				System.out.print(subscriptionPlans[i]);
			}
	}
	}

	
	public String getName() {
		
		return name;
	}

	
	public void setName(String name) {
		this.name=name;
		
	}

}

