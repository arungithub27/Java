package basics;

public class Variables {
	static int num,age;
	static char A;
	String name = "David Miller";
    
    public static void main(String args[]){
    	num=1;
    	age=2;
    	A='Z';
    	System.out.println(num+" "+age+" "+A);
    	//System.out.println(name); Cannot make a static reference to the non-static field name
    	Variables call = new Variables();
    	System.out.println(call.name);
    	call.name="Chris Morris";
    	System.out.println(call.name);
    	System.out.println(call.name);
    	Variables test = new Variables();
    	test.name="Fahraan Behardian";
    	System.out.println(test.name);
    	System.out.println(call.name);
    }
	

}
