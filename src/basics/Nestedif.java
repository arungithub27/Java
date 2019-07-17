package basics;

public class Nestedif {
	
	public static void main(String args[]){
		int a=12345;
		if(a<=100 && a>=1){
			System.out.println("Integer A is 2 Digit Number" );
			}
		else if(a<=1000 && a>=100){
			System.out.println("Integer A is 3 Digit Number");
			
		}
		else if(a<=10000 && a>=1000){
			System.out.println("Integer A is 4 Digit Number");
			
		}
		else if(a<=100000 && a>=10000){
			System.out.println("Integer A is 5 Digit Number");
		}
		else{
			System.out.println("Integer A is 6 Digit Number");
		}
	}

}
