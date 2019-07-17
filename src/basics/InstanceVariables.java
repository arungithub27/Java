package basics;

public class InstanceVariables {
	public String name = "Arun Kumar";
	public int age = 28;
	
	public static void main(String args[]){
		//to access instance variables we need to create an object bcoz it is static method (Instance = non static)
		InstanceVariables str = new InstanceVariables();
		System.out.println(str.name);
		InstanceVariables ag = new InstanceVariables();
		System.out.println(ag.age);
		System.out.println("Employee Name & Age is:"+" "+str.name+" "+ag.age);
		System.out.println("Employee Name :"+" "+str.name);
		System.out.println("Employee Age :"+" "+ag.age);
	}

}
