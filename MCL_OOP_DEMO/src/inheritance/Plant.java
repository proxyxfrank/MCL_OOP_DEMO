package inheritance;

public class Plant {
	
	protected String _name ;
	protected int _age = 0 ;
	protected int _withering_age = 5 ;
	
	public Plant() {
		
		_name = "planteeeeeeee";
		System.out.print(_name + " constructed \n");
		
	}
	
	public Plant(String name) {
		
		_name = name;
		System.out.print(_name + " constructed \n");
		
	}
	
	public void Grow () {
		
		if (_age == _withering_age) {
			
			System.out.print(_name + " is dead \n");
			
		}
		else {
			
			_age += 1 ;
			System.out.print(_name + " grows " + _age + " months \n");
			
		}
		
	}

}
