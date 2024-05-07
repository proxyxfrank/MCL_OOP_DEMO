package inheritance;

public class Flower extends Plant {
	
	public Flower() {
		
		super("floweeeeeeeeeer") ;
		super._withering_age = 10 ;
		
	}

	public Flower(String name) {
		
		super(name) ;
		super._withering_age = 10 ;
		
	}
	
	public void Grow() {
		
		super.Grow();
		
		if(super._age > 6 && super._age != super._withering_age ) {
			
			System.out.print(super._name + " is blooming \n");
			
		}
		
	}
	
}
