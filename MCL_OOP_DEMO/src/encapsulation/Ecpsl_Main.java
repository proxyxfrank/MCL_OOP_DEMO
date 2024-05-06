package encapsulation;

public class Ecpsl_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator computer = new Calculator() ;
		
		int computer_add_result = computer.Add(5 , 6);
		
		System.out.print("computer Add result :" + computer_add_result + "\n");
		
		int computer_pdt_result = computer.Product(24 , 6) ;
		
		System.out.print("computer Product result :" + computer_pdt_result + "\n");
		
		Calculator iphone = new Calculator(10 , 25);
		
		System.out.print("iphone Get a:" + iphone.Get_a() + "\n");
		
		iphone.Set_b(40);
		
		int iphone_mns_result = iphone.Minus();
		
		System.out.print("iphone Minus result :" + iphone_mns_result + "\n");
		
		float iphone_Dvd_result = iphone.Devide();
		
		System.out.print("iphone Devide result :" + iphone_Dvd_result + "\n");
	}

}
