package encapsulation;

public class Calculator {
	
	private int _a = 0;
	private int _b = 0;
	
	public Calculator() {
		
		System.out.print("Calculator constructed \n");
		
	}
	
	public Calculator(int a , int b) {
		
		_a = a ;
		_b = b ;
		System.out.print("Calculator constructed with a & b \n");
		
	}
	
	public int Get_a() {
		return _a ;
	}
	
	public int Get_b() {
		return _b ;
	}
	
	public void Set_a(int a) {
		_a = a;
	}
	
	public void Set_b(int b) {
		_b = b;
	}
		
	public int Add() {	
		return _a + _b ;
	}
	
	public int Add(int a , int b) {	
		return  a + b ;
	}
	
	public int Minus() {
		return _a - _b ;
	}
	
	public int Minus(int a , int b) {
		return  a - b ;
	}
	
	public int Product() {
		return _a * _b;
	}
	
	public int Product(int a , int b) {
		return a * b;
	}
	
	public float Devide() {
		
		try {
			
			
			return (float)_a / (float)_b ;
			
		}
		catch(ArithmeticException e) 
		{
			
			 System.out.print("_b can't be 0");
			 return 0 ;
			
		}		
		
	}
	
	public float Devide(float a , float b) {
		
		try {
			
			
			return a / b ;
			
		}
		catch(ArithmeticException e) 
		{
			
			 System.out.print("b can't be 0");
			 return 0 ;
			
		}	
		
	}

}
