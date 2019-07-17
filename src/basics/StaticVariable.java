package basics;

public class StaticVariable {
	public static String name = "Aiden A Markram Sr";
	
	public static void main(String args[]){
		System.out.println(name);
		System.out.println(name);
		//we need to change the value of STATIC VARIABLE, so create an object
		StaticVariable abc = new StaticVariable();
		abc.name= "Rassie Van Der Dussen";
		System.out.println(abc.name);
		System.out.println(name);
		//changed static variable will be common throughout bcoz it is class variable(static)
	}

}
