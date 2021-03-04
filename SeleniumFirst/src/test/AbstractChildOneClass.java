package test;

//Inheriting the AbstractSuperClass class
public class AbstractChildOneClass extends AbstractSuperClass{

	public static void main (String [] args){

             // Here we cannot instantiate the AbstractSuperClass class but we can instantiate the AbstractChildClass class
             // Using the instance of AbstractChildClass we can access methods and data members of AbstractSuperClass class
	
		AbstractChildOneClass obj = new AbstractChildOneClass();
		
		System.out.println("I am a data member from Super class and my value is " + obj.a);
//		obj.myMethod();
//		obj.myMethod(20);
		obj.myMethod();
		obj.myMethod(5);
		
	}

	@Override
	void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("I am in child class");
	}

	
//	@Override
//	void myMethod() {
//
//		System.out.println("I am in child class");
//		
//	}

}