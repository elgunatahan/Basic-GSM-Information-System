package ndkdönemprojesi;

public class GSMProvider implements ServiceProvider {
 
    private int Count,MaxCount ;
	private String name;
    private SubscriptionPlan[] subscriptionPlans;
    
	public GSMProvider(String name) {
		super();
		this.name = name;
        Count = 0;
        MaxCount=100;
        subscriptionPlans =new SubscriptionPlan[MaxCount];
	}

	
	public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		if(this.MaxCount>this.Count){
			subscriptionPlans[Count]=subscriptionPlan;
		    this.Count++;
		}
		
	}
	
	public SubscriptionPlan findSubscriptionPlan(String name) {
		for(int i = 0;i<Count;i++){
			if(this.subscriptionPlans[i].getName().equals(name)){
				return subscriptionPlans[i];
			}
			
	}
		return null;
	}

	
	public String getName() {
		
		return name;
	}

	
	public void setName(String name) {
		this.name=name;
		
	}

}
