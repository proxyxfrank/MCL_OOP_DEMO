package polymorphism;

import inheritance.Plant ;
import inheritance.Tree ;
import inheritance.Flower ;
import java.util.ArrayList;
import java.util.List;

public class Plmpsm_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree apple_tree = new Tree("My apple tree") ;
		Flower plum_bossom = new Flower ("Winter plum flower") ;
		Flower sunflower = new Flower("sun flower") ;
		Plant vine = new Plant("vine") ;
		
		List<Plant> garden = new ArrayList<Plant>();
		
		garden.add(apple_tree) ;
		garden.add(plum_bossom) ;
		garden.add(sunflower) ;
		garden.add(vine) ;
		
		for(int i = 0 ; i < 6 ; i++ ) {
			
			for(Plant plant : garden) {
				
				plant.Grow();
				
			}
			
			System.out.print("\n");
				
		}
		
	}

}
