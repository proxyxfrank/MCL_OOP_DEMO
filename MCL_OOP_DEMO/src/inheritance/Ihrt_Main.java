package inheritance;

public class Ihrt_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant grass = new Plant();
		
		for(int i = 0 ; i < 6 ; i++) {
			
			grass.Grow() ;
			
		}
		
		Tree pine = new Tree() ;
		
		for(int i = 0 ; i < 101 ; i++) {
			
			pine.Grow() ;
			
		}		
		
		Flower sunflower = new Flower("sun flower") ; 
		
		for(int i = 0 ; i < 11 ; i++) {
			
			sunflower.Grow() ;
			
		}
				
	}

}
