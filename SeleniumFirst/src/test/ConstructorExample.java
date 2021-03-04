package test;

public class ConstructorExample {

	public ConstructorExample() {
		String a = "sandhya";

		System.out.println("print constructor:::" + a);
	}

	// returns value
	public String testingFn(String str) {
		// String a = "moorthy";
		System.out.println("print passing parameters:::" + str);
		return str;
	}

	// void method
	public void testingVoidFunction() {
		String a = "moorthy";
		System.out.println("print void method:::" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample ce = new ConstructorExample();
		ce.testingFn("aarohi");
		ce.testingVoidFunction();
	}

}
